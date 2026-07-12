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
        // Arrays.fill(dp,-1);
        // return fibno(n,dp);
        // Bottom Up Approch 
        if(n<=1)
            return n;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}