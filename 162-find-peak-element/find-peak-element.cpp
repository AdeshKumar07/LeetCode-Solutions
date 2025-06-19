class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        if(nums.size()==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.size()-1]>nums[nums.size()-2]) return nums.size()-1;
    
       int s=1;
       int l=nums.size()-2;
       while(s<=l){
        int mid=s+(l-s)/2;
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
            return mid;
        }
        else if(nums[mid]<nums[mid+1]){
            s=mid+1;
        }
        else{
            l=mid-1;
        }
       }
       return 0;
    }
};
