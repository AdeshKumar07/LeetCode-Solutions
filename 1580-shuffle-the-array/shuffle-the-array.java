class Solution {
    public int[] shuffle(int[] nums, int n) {        
        int[] x=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;i++){
            x[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            y[i-n]=nums[i];
        }
       int[] r=new int[2*n];
       for(int i=0;i<n;i++){
        r[i*2]=x[i];
        r[i*2+1]=y[i];
       }
       return r;       
    }
}