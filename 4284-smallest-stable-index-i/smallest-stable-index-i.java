class Solution {
    static int maxv(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    static int minv(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
           int[] left=new int[i+1];
           for(int j=0;j<=i;j++){
            left[j]=nums[j];
           }

           int[] right=new int[nums.length-i];
           for(int j=i;j<nums.length;j++){
            right[j-i]=nums[j];
           }

           if((maxv(left)-minv(right))<=k){
            return i;
           }


        }
     return -1;

        
    }
}