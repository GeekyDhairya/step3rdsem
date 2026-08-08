// Problem4.java
public class Problem4 {
    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        int sumA = 0, sumB = 0, maxVal = Integer.MIN_VALUE, maxIdx = -1;
        String maxSec = "";

        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];
            sumB += sectionB[i];
            
            if (sectionA[i] > maxVal) { maxVal = sectionA[i]; maxSec = "Section A"; maxIdx = i + 1; }
            if (sectionB[i] > maxVal) { maxVal = sectionB[i]; maxSec = "Section B"; maxIdx = i + 1; }
        }

        String status = (sumA == sumB) ? "Balanced" : "Not Balanced";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
                sumA, sumB, status, maxVal, maxSec, maxIdx);
    }
}
