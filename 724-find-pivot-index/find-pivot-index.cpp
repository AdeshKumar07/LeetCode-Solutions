class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int t_s=0;
        for(int s:nums){
            t_s=t_s+s;
        }
        int l_s=0;
        for(int i=0;i<nums.size();i++){
            if(l_s==t_s-l_s-nums[i]){
                return i;
            }
            l_s+=nums[i];
        }
        return -1;
    }
};