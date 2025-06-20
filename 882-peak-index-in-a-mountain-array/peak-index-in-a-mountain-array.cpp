class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
       int max=arr[0];
       int idx=0;
       for(int i=0;i<arr.size()-1;i++){
        if(arr[i]>max){
            max=arr[i];
           idx=i;
        }
       }
        return idx;
        
    }
};