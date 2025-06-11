class Solution {
    public int search(int[] nums, int target) {
        int idx=0;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                idx=i;
                f=true;
            }
        }
        if(f){
            return idx;
        }
        return -1;
        
    }
}