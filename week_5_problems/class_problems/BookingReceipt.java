package week_5_problems.class_problems;

class BookingReceipt {
    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(String id, String[] seats) {
        this.bookingId = id;

        if (seats == null) {
            this.seatNumbers = new String[0];
        } else {
            this.seatNumbers = new String[seats.length];
            for (int i = 0; i < seats.length; i++) {
                this.seatNumbers[i] = seats[i];
            }
        }
    }

    public String[] getSeatNumbers() {
        String[] copy = new String[this.seatNumbers.length];
        for (int i = 0; i < this.seatNumbers.length; i++) {
            copy[i] = this.seatNumbers[i];
        }
        return copy;
    }

    public BookingReceipt withUpdatedSeat(int index, String newSeat) {
        String[] copyOfSeats = this.getSeatNumbers();

        if (index >= 0 && index < copyOfSeats.length) {
            copyOfSeats[index] = newSeat;
        }

        return new BookingReceipt(this.bookingId, copyOfSeats);
    }
}

class GroupBookingReceipt extends BookingReceipt {
    private final int groupSize;

    public GroupBookingReceipt(String id, String[] seats, int size) {
        super(id, seats);
        this.groupSize = size;
    }
}

class SettlementProcessor {
    static String processNightlySettlement(BookingReceipt[] receipts) {
        int processed = 0;
        int skipped = 0;
        int groups = 0;
        int individuals = 0;

        for (int i = 0; i < receipts.length; i++) {
            BookingReceipt receipt = receipts[i];

            if (receipt == null) {
                skipped++;
            } else {
                processed++;
                if (receipt instanceof GroupBookingReceipt) {
                    groups++;
                } else {
                    individuals++;
                }
            }
        }

        return processed + " processed | " + skipped + " null skipped\n" +
                groups + " group | " + individuals + " individual";
    }
}

class Main5 {
    public static void main(String[] args) {
        String[] mySeats = {"A1", "A2"};
        BookingReceipt receipt = new BookingReceipt("CH-1001", mySeats);

        BookingReceipt updated = receipt.withUpdatedSeat(1, "A3");
        System.out.println(receipt.getSeatNumbers()[1]);
        System.out.println(updated.getSeatNumbers()[1]);

        BookingReceipt[] nightBatch = new BookingReceipt[3];
        nightBatch[0] = new GroupBookingReceipt("CH-2002", new String[] {"B1", "B2"}, 2);
        nightBatch[1] = null;
        nightBatch[2] = new BookingReceipt("CH-3003", new String[] {"C1"});

        System.out.println(SettlementProcessor.processNightlySettlement(nightBatch));
    }
}
