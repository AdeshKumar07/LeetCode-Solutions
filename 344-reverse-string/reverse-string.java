class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int st=0;
        int ed=n-1;
        while(st<ed){
            char temp=s[st];
            s[st]=s[ed];
            s[ed]=temp;
            st++;
            ed--;
        }
        // return s;
    }
}