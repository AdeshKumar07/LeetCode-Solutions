class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int currMaxSum=0;
        int currMinSum=0;
        int cirSum=0;
        int maxSum=nums[0];
        int minSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currMaxSum=Math.max(currMaxSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currMaxSum);
            
            currMinSum=Math.min(currMinSum+nums[i],nums[i]);
            minSum=Math.min(currMinSum,minSum);
            
            totalSum += nums[i];
        }
        int normalSum=maxSum;
        cirSum=totalSum-minSum;
        if(minSum == totalSum){
            return normalSum;
        }
        return Math.max(normalSum,cirSum);
        
    }
}