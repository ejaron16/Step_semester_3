package week_1_practise_problems;

public class PalindromeChecker {
    public static void main(String[] args) {
        String[] tests = {"madam", "hello"};

        for (String text : tests) {
            boolean iter = isPalindromeIterative(text);
            boolean rec = isPalindromeRecursive(text);
            boolean arr = isPalindromeArrayReversal(text);

            System.out.printf("Input: \"%s\" | Iterative: %s | Recursive: %s | Array Reversal: %s\n",
                    text,
                    iter ? "Palindrome" : "Not Palindrome",
                    rec ? "Palindrome" : "Not Palindrome",
                    arr ? "Palindrome" : "Not Palindrome");
        }
    }

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i];
        }
        return text.equals(reversed);
    }
}