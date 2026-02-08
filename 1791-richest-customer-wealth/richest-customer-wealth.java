class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int sum=0, max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(max < sum){
                max=sum;
            }
            sum = 0;
        }
        return max;
    }
}