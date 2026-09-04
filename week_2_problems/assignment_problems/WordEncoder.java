package week_2_problems.assignment_problems;

public class WordEncoder {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}