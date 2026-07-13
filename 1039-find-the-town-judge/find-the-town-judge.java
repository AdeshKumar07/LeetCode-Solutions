class Solution {
    public int findJudge(int n, int[][] trust) {
        //  1 is judge from n
        if(n==1){
            return 1;

        }
        int[] inde=new int[n+1];
        int[] outde=new int[n+1];
        

        for(int[] rel:trust){
            int a=rel[0];
            int b=rel[1];
            outde[a]++;
            inde[b]++;

        }
        for(int i=1;i<=n;i++){
            if(outde[i]==0 && inde[i]==n-1) return i;
        }

        return -1;
    }
}