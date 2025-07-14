class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]arr=new int[2];
        Arrays.sort(nums);
        int n=nums.length;
        int r_s=n*(n+1)/2;
        int a_s=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                arr[0]=nums[i];
            }
        }
        for(int num:nums){
            a_s+=num;
        }
        arr[1]=r_s-(a_s-arr[0]);
        
       
        return arr;
        
    }
}