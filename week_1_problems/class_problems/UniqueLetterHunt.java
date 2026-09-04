package week_1_practise_problems;

public class UniqueLetterHunt {
    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc"};

        for (String text : inputs) {
            char result = findFirstNonRepeatingChar(text);
            if (result != '\0') {
                System.out.println("Input: \"" + text + "\" | First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("Input: \"" + text + "\" | No Non-Repeating Character Found");
            }
        }
    }

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequencies = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequencies[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequencies[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }
}