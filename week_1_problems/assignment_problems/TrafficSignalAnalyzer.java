package week_1_assignment_problems;

public class TrafficSignalAnalyzer {
    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;

        int maxStreak = 0;
        char maxChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                maxChar = signalLog.charAt(i);
            }
        }

        if (maxStreak == 0) maxStreak = 1; // Catch edge cases where string length is 1

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxStreak + " times");
    }
}