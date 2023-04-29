package Prak6.nangs;

import java.util.ArrayList;

public class PalindromeProcessor {

    public String longestPalindromeSubstring(String str) {
        // keluarkan susbtring palindrome terpanjang
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        String longestPalindrome = "";

        // Setiap string dengan panjang 1 adalah palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            longestPalindrome = str.substring(i, i + 1);
        }

        // Cek untuk substring dengan panjang 2
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                longestPalindrome = str.substring(i, i + 2);
            }
        }

        // Cek untuk substring dengan panjang lebih dari 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    longestPalindrome = str.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
    }
}
