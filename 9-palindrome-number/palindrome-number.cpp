class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int o=x;
        long long r=0;
        while(x>0){
           int l=x%10;
           r=r*10+l;
           x=x/10;

        }
        return o==r;
        
    }
};