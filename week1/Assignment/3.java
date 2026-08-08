// Problem3.java
public class Problem3 {
    public void findLongestStreak(String signalLog) {
        char maxChar = signalLog.charAt(0);
        int maxLen = 1, currentLen = 1;
        
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxChar = signalLog.charAt(i);
            }
        }
        System.out.printf("Longest Streak: '%c' repeated %d times%n", maxChar, maxLen);
    }
}
