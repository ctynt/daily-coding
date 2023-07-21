package top.ctynt.day7;

/**
 * @Author ctynt
 * @Date 2023/7/11
 * @Description 最长回文子串
 */

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int N = s.length();
        boolean[][] dp = new boolean[N][N];
        String res = "";

        for (int i = N - 1; i >= 0; i--) {
            for (int j = i; j < N; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
                if (dp[i][j] && (j - i + 1) > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
