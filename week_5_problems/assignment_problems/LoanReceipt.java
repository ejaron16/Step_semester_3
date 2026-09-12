package week_5_problems.assignment_problems;

class LoanReceipt {
    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds) {
        this.memberId = memberId;

        if (bookIds == null) {
            this.bookIds = new String[0];
        } else {
            this.bookIds = new String[bookIds.length];
            for (int i = 0; i < bookIds.length; i++) {
                this.bookIds[i] = bookIds[i];
            }
        }
    }

    public String[] getBookIds() {
        String[] copy = new String[this.bookIds.length];
        for (int i = 0; i < this.bookIds.length; i++) {
            copy[i] = this.bookIds[i];
        }
        return copy;
    }

    public LoanReceipt withCorrectedBookId(int index, String newId) {
        String[] copyOfBooks = this.getBookIds();

        if (index >= 0 && index < copyOfBooks.length) {
            copyOfBooks[index] = newId;
        }

        return new LoanReceipt(this.memberId, copyOfBooks);
    }
}

class ReferenceOnlyLoanReceipt extends LoanReceipt {
    private final String roomNumber;

    public ReferenceOnlyLoanReceipt(String memberId, String[] bookIds, String roomNumber) {
        super(memberId, bookIds);
        this.roomNumber = roomNumber;
    }
}

class CirculationLedger {
    static String branchCode;

    static {
        branchCode = "PT-MAIN-01";
    }

    static String processNightlyCirculation(LoanReceipt[] receipts) {
        int processed = 0;
        int skipped = 0;
        int referenceOnly = 0;
        int regular = 0;

        for (int i = 0; i < receipts.length; i++) {
            LoanReceipt receipt = receipts[i];

            if (receipt == null) {
                skipped++;
            } else {
                processed++;
                if (receipt instanceof ReferenceOnlyLoanReceipt) {
                    referenceOnly++;
                } else {
                    regular++;
                }
            }
        }

        return processed + " processed | " + skipped + " null skipped | " +
                referenceOnly + " reference-only | " + regular + " regular";
    }
}

class Main5 {
    public static void main(String[] args) {
        String[] ids = {"BK-100", "BK-101"};
        LoanReceipt r = new LoanReceipt("LIB-8841", ids);

        String[] myIds = r.getBookIds();
        myIds[0] = "HACKED";
        System.out.println(r.getBookIds()[0]);

        LoanReceipt corrected = r.withCorrectedBookId(1, "BK-102");
        System.out.println(r.getBookIds()[1]);
        System.out.println(corrected.getBookIds()[1]);

        LoanReceipt[] nightBatch = new LoanReceipt[3];
        nightBatch[0] = new ReferenceOnlyLoanReceipt("LIB-001", new String[]{"BK-200"}, "Reading Room 3");
        nightBatch[1] = null;
        nightBatch[2] = new LoanReceipt("LIB-002", new String[]{"BK-201"});

        System.out.println(CirculationLedger.processNightlyCirculation(nightBatch));
    }
}
