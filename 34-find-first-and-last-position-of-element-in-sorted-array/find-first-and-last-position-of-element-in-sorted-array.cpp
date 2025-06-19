class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res={-1,-1};
        int f=0;
        int l=nums.size()-1;

        while(f<=l){
            int mid=f+(l-f)/2;
            if(nums[mid]==target){
                res[0]=mid;
                l=mid-1;
            }
            else if(nums[mid]<target){
                f=mid+1;

            }
            else{
                l=mid-1;
            }
        }
        f=0;
        l=nums.size()-1;
        while(f<=l){
            int mid=(l+f)/2;
            if(target==nums[mid]){
                res[1]=mid;
                f=mid+1;
            }
            else if(nums[mid]<target){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
        }
return res;

    
        
    }
};