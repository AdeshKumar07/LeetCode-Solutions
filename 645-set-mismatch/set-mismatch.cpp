class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> res(2);
        int n=nums.size();
        int r_s=n*(n+1)/2;
        int a_s=0;
        for(int num : nums) a_s+=num;
        for(int i=1;i<n;i++) {
            if(nums[i-1]==nums[i]) {
                res[0]=nums[i];
            }
        }
        res[1]=r_s-(a_s-res[0]);
        return res;
    }
};