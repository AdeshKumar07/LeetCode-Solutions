class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,maxSum=0;
        for(int i=0;i<k;i++){ sum+=nums[i]; 
        }
        maxSum = sum; 
        for(int i=1;i<=nums.length - k ;i++){ 
            sum = sum - nums[i-1] + nums[i+k-1]; 
            if(sum > maxSum){
                maxSum = sum; } 
            }
        return maxSum/k; 
        
    }
}