/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int f=1;
        int l=n;
        int res=-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(isBadVersion(mid)==true){
                res=mid;
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        return res;
        
    }
}