class Solution {
    public int maxSubArray(int[] nums) {
        int c_s=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            if(c_s+nums[i]>nums[i]){
                c_s=c_s+nums[i];
            }
            else{
                c_s=nums[i];
            }
            max=Math.max(c_s,max);

        }
        return max;
    }
}