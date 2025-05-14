class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
      while(k>0){
        int m_i=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[m_i]){
                m_i=i;
            }
        }
         nums[m_i]=nums[m_i]*multiplier;
            k--;
      }
      return nums;
    }
}