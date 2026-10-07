class Solution {
    public int fib(int n) {
        // if(n<2){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);
        if (n < 2) {
            return n;
        }
        int f=0;
        int s=1;
        int cur=0;
       
        for(int i=2;i<=n;i++){
            cur=f+s;
            f=s;
            s=cur;
        }
        return cur;
    }
}