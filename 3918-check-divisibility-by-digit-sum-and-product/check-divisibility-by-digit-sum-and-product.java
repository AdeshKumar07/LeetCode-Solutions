class Solution {
    public boolean checkDivisibility(int n) {
        int or=n;
        int s=0,pr=1;
        
        while(n>0){
            int l=n%10;
            s+=l;
            pr*=l;
            n=n/10;
        }
        int sum=s+pr;

        if(or%sum == 0){
            return true;
        }
        return false;
        
    }
}