class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        int min=nums[0];
        int s=(max-min)-2*k;
        if(s<0){
            return 0;
        }
        return s;
        
    }
}