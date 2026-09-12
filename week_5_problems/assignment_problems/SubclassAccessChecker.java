package week_5_problems.assignment_problems;

class SubclassAccessChecker {
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

        if (fieldModifier.equals("protected")) {
            if (accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {
                return "ALLOWED";
            }
            if (accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE")) {
                return "DENIED";
            }
        }

        return "DENIED";
    }

    static String firstDeniedAttempt(String[][] attempts) {
        for (int i = 0; i < attempts.length; i++) {
            String modifier = attempts[i][0];
            String context = attempts[i][1];

            String result = classifyAccess(modifier, context);

            if (result.equals("DENIED")) {
                int attemptNumber = i + 1;
                return modifier + " via " + context + " (attempt #" + attemptNumber + ")";
            }
        }
        return "None Denied";
    }
}

class Main2 {
    public static void main(String[] args) {
        String[][] attempts1 = {
                {"public", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},
                {"protected", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},
                {"protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"}
        };
        System.out.println(SubclassAccessChecker.firstDeniedAttempt(attempts1));

        String[][] attempts2 = {
                {"public", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"},
                {"protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"}
        };
        System.out.println(SubclassAccessChecker.firstDeniedAttempt(attempts2));
    }
}
