class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int r_i=0;
        int l=nums[0];
        for(int i=0;i<nums.size();i++){
            if(nums[i]>l){
                r_i=i;
                l=nums[i];
            }
        }
        for(int i=0;i<nums.size();i++){
            if(r_i!=i && l<2*nums[i]) 
            return -1;

        }
        return r_i;
       
       
    }
};