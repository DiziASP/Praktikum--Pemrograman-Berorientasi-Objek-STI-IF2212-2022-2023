import java.util.ArrayList;

public class PalindromeProcessor {

    private int startIndex, maxLen;

    public String longestPalindromeSubstring(String str) {
        int len = str.length();
        if (len < 2) return str;

        for (int i = 0; i < len - 1; i++) {
            expandFromMiddle(str, i, i); // asumsi panjangnya ganjil
            expandFromMiddle(str, i, i + 1); // asumsi panjangnya genap
        }
        return str.substring(startIndex, startIndex + maxLen);
    }

    private void expandFromMiddle(String str, int i, int j) {
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }

        // ngecek apakah palindrom sekarang udah lebih gede, kalo rangenya udah lebih gede, update starting index sama maxLennya
        if (maxLen < j - i - 1) {
            startIndex = i + 1;
            maxLen = j - i - 1;
        }
    }
}
