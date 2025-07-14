class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int r_i=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                r_i=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(r_i!=i && max<2*nums[i]) 
            return -1;

        }
        return r_i;
    }
}