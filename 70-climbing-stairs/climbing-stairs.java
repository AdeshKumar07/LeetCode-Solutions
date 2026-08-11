class Solution {
    public int climbStairs(int n) {
        // int[] dp=new int[n+1];
        // if(n<=2){
        //     return n;
        // }
        // dp[1]=1;
        // dp[2]=2;
        // for(int i=3;i<=n;i++){
        //     dp[i]=dp[i-2]+dp[i-1];
        // }
        // return dp[n];

        // if(n<=2){
        //     return n;
        // }

        // int prev1=1;
        // int prev2=2;
        // int curr=0;
        // for(int i=3;i<=n;i++){
        //     curr=prev1+prev2;
        //     prev1=prev2;
        //     prev2=curr;

        // }
        // return curr;
        // if(n<=2){
        //     return n;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
        if(n<=2) return n;
        int p1=1;
        int p2=2;
        int curr=0;
        for(int i=3;i<=n;i++){
            curr=p1+p2;
            p1=p2;
            p2=curr;
        }
        return curr;
    }
}