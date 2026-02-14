class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        long sum=0,maxSum=0;
        int left=0;
        for(int r=0;r<n;r++){
            sum+=nums[r]; 
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(r - left +1 > k){
                sum -= nums[left];
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0 ){
                    map.remove(nums[left]);
                }
                left++;
            }
            if( r - left + 1 == k && map.size() == k){
                maxSum=Math.max(maxSum, sum);
            }
           
        }
        return maxSum;
    }
}