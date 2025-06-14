class Solution {
   
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int cx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else if(nums[i]==0){
                cx=Math.max(cx,c);
                c=0;
            }              
        }
        return Math.max(c,cx);

    }
}