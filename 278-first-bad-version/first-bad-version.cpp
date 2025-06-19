// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
     int f=0;
     int l=n;
     int ans=-1;
     while(f<=l){
         int mid=f+(l-f)/2;
         if(isBadVersion(mid)==true){
            ans=mid;
            l=mid-1;
         }
         else{
            f=mid+1;
         }
    }
    return ans;    
    }
};