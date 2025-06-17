class Solution {
public:
    int minPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int max_s=0;
        int i=0,j=nums.size()-1;
        while(i<j){
            int pair_sum=nums[i]+nums[j];
            max_s=max(max_s,pair_sum);
            i++;
            j--;
        }
        return max_s;       
    }
};