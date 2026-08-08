// Problem5.java
public class Problem5 {
    public void classifyWordLengths(String review) {
        int shortCount = 0, medCount = 0, longCount = 0;
        for (String word : review.trim().split("\\s+")) {
            int len = word.length();
            if (len <= 4) shortCount++;
            else if (len <= 8) medCount++;
            else longCount++;
        }
        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortCount, medCount, longCount);
    }
}
