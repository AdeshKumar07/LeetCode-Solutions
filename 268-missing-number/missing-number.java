class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;
        int a_s=0;
        for(int i=0;i<n;i++){
            a_s=a_s+nums[i];

        }
        return s-a_s;
        
    }
}