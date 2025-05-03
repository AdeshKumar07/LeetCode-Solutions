class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        int count=0;
        int i;
       for (i = 0; i < n - 1; i++) {
           if(nums[i]!=0){
            if(nums[i]==nums[i+1]){
                result[count]=nums[i]*2;
                i++;
            }
            else{
            result[count]=nums[i];
           }
           count++;
           }
           
        }
        if(i!=nums.length){
            result[count]=nums[nums.length-1];
        }
        return result;

      
      
        
    }
}