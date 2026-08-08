// Problem2.java
public class Problem2 {
    public void checkTypingAccuracy(String original, String typed) {
        int matched = 0, firstMismatch = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }
        double accuracy = (double) matched / original.length() * 100;
        String result = String.format("Matched: %d/%d | Accuracy: %.2f%% | ", matched, original.length(), accuracy);
        if (firstMismatch == -1) {
            System.out.println(result + "No Mismatches");
        } else {
            System.out.printf("%sFirst Mismatch at position %d ('%c' vs '%c')%n", 
                result, firstMismatch + 1, original.charAt(firstMismatch), typed.charAt(firstMismatch));
        }
    }
}
