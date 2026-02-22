class Solution {
    public int maxProduct(int[] nums) {
        int c_max=nums[0];
        int c_min=nums[0];
        int maxp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=c_max;
                c_max=c_min;
                c_min=temp;
            }
            c_max=Math.max(nums[i],nums[i]*c_max);
            c_min=Math.min(nums[i],nums[i]*c_min);
            maxp=Math.max(c_max,maxp);
        }
    return maxp;
    }
}