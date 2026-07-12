class Solution {
    static int fibno(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibno(n-1,dp)+fibno(n-2,dp);

    }
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibno(n,dp);

        
    }
}