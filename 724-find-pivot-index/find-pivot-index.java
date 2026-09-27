class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int l_s=0;
        int r_s=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<nums.length;i++){
            r_s=sum-l_s-nums[i];
            if(r_s == l_s){
                return i;
            }
            l_s+=nums[i];
        }
        return -1;
    }
}