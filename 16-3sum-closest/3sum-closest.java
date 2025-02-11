class Solution {
    public int threeSumClosest(int[] nums, int target) {
      //first we need to sort the nums
      Arrays.sort(nums); 
      int closetSum=nums[0]+nums[1]+nums[2];
      //now fix first element and find the ohter two element
      
      for(int i=0;i<nums.length - 1;i++){
        //Find others two elements using Two Sum approch
        int left=i+1;
        int right=nums.length -1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==target){
                return target;
            }
            if(Math.abs(sum - target) < Math.abs(closetSum - target)){
                closetSum=sum;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }   
      }
      return closetSum;
    }
}