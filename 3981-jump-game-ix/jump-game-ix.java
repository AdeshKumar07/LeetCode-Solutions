class Solution {
    public int[] maxValue(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int preM[] = new int[n];

        preM[0]=nums[0];
        for(int i=1;i<n;i++){
            preM[i]=Math.max(preM[i-1],nums[i]);
        }
        int sufM=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(i==n-1 || preM[i]>sufM){
                res[i]=(i == n-1)?preM[i] :res[i+1];
            }
            else{
                res[i]=preM[i];
            }
            sufM=Math.min(sufM,nums[i]);
        }
    return res;
    }
}