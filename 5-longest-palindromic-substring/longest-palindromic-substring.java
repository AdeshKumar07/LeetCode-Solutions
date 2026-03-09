class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        int[][] dp = new int[n + 1][n + 1];
        int mlen = 0;
        int lidx = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > mlen) {
                        int oidx = n - j; 
                        if (oidx + dp[i][j] == i) {
                            mlen = dp[i][j];
                            lidx = i;
                        }
                    }
                }
                else {
                    dp[i][j] = 0;
                }
            }     
        }
        return s.substring(lidx - mlen, lidx);
    }
}
