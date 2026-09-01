class Solution {
    int digsum(int n){
        int sum=0;
        while(n>0){
            int l=n%10;

            sum+=l;
            n/=10;

        }
        return sum;
    }
    int digp(int n){
        int pr=1;
        while(n>0){
            int l=n%10;
            pr*=l;
            n/=10;
        }
        return pr;
    }
    public boolean checkDivisibility(int n) {
        int s=digsum(n);
        int p=digp(n);
        int x=s+p;
        if(n%x == 0){
            return true;
        }
        return false;
    }
}