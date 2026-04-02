class Solution {
    int m, n;
    int[][][] t;
    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;
        t = new int[m][n][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    t[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        return solve(coins, 0, 0, 2);
        }

        int solve(int[][] coins, int i, int j, int neu) {
        if (i >= m || j >= n) return -1000000000; 
        if (i == m - 1 && j == n - 1) {
            if (coins[i][j] < 0 && neu > 0) return 0;
            return coins[i][j];
        }

        if (t[i][j][neu] != Integer.MIN_VALUE) return t[i][j][neu];
        long take = coins[i][j] + (long) Math.max(solve(coins, i + 1, j, neu), solve(coins, i, j + 1, neu));

        long skip = Integer.MIN_VALUE;
        if (coins[i][j] < 0 && neu > 0) {
            skip = Math.max(solve(coins, i + 1, j, neu - 1), solve(coins, i, j + 1, neu - 1));
        }

        return t[i][j][neu] = (int) Math.max(take, skip);
    }
}
