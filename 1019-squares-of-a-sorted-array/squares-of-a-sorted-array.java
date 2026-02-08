class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        // for(int i=0;i<n;i++){
        //     ans[i]=(nums[i]*nums[i]);
        // }
        // Arrays.sort(ans); 
        int s=0, e=n-1;
        int i=n-1;
        while(s<=e){
            int fs=nums[s]*nums[s];
            int le=nums[e]*nums[e];
            if(fs > le){
                ans[i]=fs; 
                s++;
            }
            else{
                ans[i]=le;
                e--;
            }
            i--;
        }
        return ans;    
    }
}