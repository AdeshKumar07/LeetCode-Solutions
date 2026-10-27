class Solution {
    public boolean judgeCircle(String moves) {
       
        // code here
        int x=0;
        int y=0;
        String s=moves.toUpperCase();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                y=y+1;
            }
            else if(s.charAt(i)=='D'){
                y=y-1;
            }
            else if(s.charAt(i)=='R'){
                x=x+1;
            }
            else if(s.charAt(i)=='L'){
                x=x-1;
            }
            
        }
        if(x==0 && y==0) return true;
        return false;
    }
}