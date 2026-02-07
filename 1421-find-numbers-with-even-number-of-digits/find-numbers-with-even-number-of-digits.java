class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(countdigit(nums[i])%2 == 0){
                ans++;
            }
        }
        return ans;
    }
    private int countdigit(int num){
        int d=0;
        while(num>0){
            num=num/10;
            d++;
        }
    return d;
    }
}