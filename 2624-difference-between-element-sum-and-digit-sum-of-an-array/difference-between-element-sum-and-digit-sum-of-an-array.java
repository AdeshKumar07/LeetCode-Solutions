class Solution {
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            int l=num%10;
            sum+=l;
            num=num/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int arr_s=0,digitS=0;
        for(int i=0;i<n;i++){
            arr_s += nums[i];
            digitS += digitSum(nums[i]);
        }
        return Math.abs(arr_s-digitS);
    }
}