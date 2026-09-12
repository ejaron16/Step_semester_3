package week_5_problems.class_problems;

class MovieTicket {
    private String seatNumber;
    String screenId;
    protected double ticketPrice;
    public String movieTitle;
}

class AccessChecker {
    static String classifyAccess(String fieldModifier, String accessorContext) {
        if (fieldModifier.equals("public")) {
            return "ALLOWED";
        }

        if (accessorContext.equals("SAME_CLASS")) {
            return "ALLOWED";
        }

        if (accessorContext.equals("SAME_PACKAGE")) {
            if (fieldModifier.equals("private")) {
                return "DENIED";
            } else {
                return "ALLOWED";
            }
        }

        return "DENIED";
    }

    static String summarizeBatch(String[][] attempts) {
        int allowedCount = 0;
        int deniedCount = 0;

        for (int i = 0; i < attempts.length; i++) {
            String modifier = attempts[i][0];
            String context = attempts[i][1];

            String result = classifyAccess(modifier, context);

            if (result.equals("ALLOWED")) {
                allowedCount++;
            } else {
                deniedCount++;
            }
        }
        return "Allowed: " + allowedCount + "\nDenied: " + deniedCount;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(AccessChecker.classifyAccess("private", "SAME_CLASS"));
        System.out.println(AccessChecker.classifyAccess("protected", "DIFFERENT_PACKAGE"));

        String[][] batchAttempts = {
                {"default", "SAME_PACKAGE"},
                {"default", "DIFFERENT_PACKAGE"},
                {"public", "DIFFERENT_PACKAGE"}
        };
        System.out.println(AccessChecker.summarizeBatch(batchAttempts));
    }
}