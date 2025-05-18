class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       int i=0;
       int j=n-1;
       long move=0;
       while(i<j){
        move=move+nums[j]-nums[i];
        i++;
        j--;
       }
       return (int)move;
       
    }
}