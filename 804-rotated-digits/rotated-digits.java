class Solution {
    static boolean check(int num){
        boolean res=false;
        while(num>0){
            int d=num%10;
            if(d==3 || d==4 || d==7){
                return false;
            }
            if(d==2 || d==5 || d==6 || d==9){
                res = true;
            }
            num=num/10;
        }
        return res;
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(check(i)){
                count++;
            } 
        }
        return count;
    }
}