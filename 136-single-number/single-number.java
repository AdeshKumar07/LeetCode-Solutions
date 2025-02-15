class Solution {
    public int singleNumber(int[] nums) {
        int U_e=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            U_e =U_e ^ nums[i];
        }
        return U_e;
    }
}