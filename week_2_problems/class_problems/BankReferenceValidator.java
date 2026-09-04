package week_2_problems.class_problems;

public class BankReferenceValidator {
    public static void main(String[] args) {
        System.out.println(validateAndFormat(normalizeReference("hdf03022600042")));
        System.out.println(validateAndFormat(normalizeReference("12F03022600042")));
    }

    public static String normalizeReference(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed;
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) return "Invalid: wrong length";

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String bank = reference.substring(0, 3);
        String date = reference.substring(3, 5) + "/" +
                reference.substring(5, 7) + "/" +
                reference.substring(7, 9);
        String seq = reference.substring(9);

        StringBuilder result = new StringBuilder();
        result.append("[").append(bank).append("] DATE: ").append(date)
                .append(" | SEQ: ").append(seq);

        return result.toString();
    }
}
