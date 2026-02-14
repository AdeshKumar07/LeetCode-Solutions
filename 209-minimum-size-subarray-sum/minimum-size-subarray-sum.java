class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            while (currentSum >= target) {  
                int currentWindowSize = right - left + 1;
                if (currentWindowSize < minLength) {
                    minLength = currentWindowSize;
                }      
                currentSum -= nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLength;
        }
    }
}
