class Solution {
    public int findDuplicate(int[] nums) {
        int d=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                d=nums[i];

            }
        }
        return d;
        
        
    }
}