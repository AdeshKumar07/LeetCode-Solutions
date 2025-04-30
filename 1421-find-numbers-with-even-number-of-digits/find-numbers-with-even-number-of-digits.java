class Solution {
    int countd(int val){
        int d=0;
        while(val>0){
            d++;
            val=val/10;
        }
        return d;
    }
    public int findNumbers(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(countd(nums[i])%2==0){
                x++;


            }
        }
        return x;
    }
}