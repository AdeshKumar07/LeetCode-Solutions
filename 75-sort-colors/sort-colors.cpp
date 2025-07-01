class Solution {
public:
    void sortColors(vector<int>& nums) {
        for(int i=0;i<nums.size()-1;i++){
            int minidx=i;
            for(int j=i+1;j<nums.size();j++){
                if(nums[j]<nums[minidx]){
                    minidx=j;
                }
            }
            swap(nums[minidx],nums[i]);
        }
        
    }
};