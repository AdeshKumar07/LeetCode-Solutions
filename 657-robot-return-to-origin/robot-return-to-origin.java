class Solution {

    public static boolean check(String str1){
        int x=0,y=0;
        String str=str1.toUpperCase();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='U'){
                y++;
            }
            else if(str.charAt(i)=='D'){
                y--;
            }
            else if(str.charAt(i)=='L'){
                x--;
            }
            else{
                x++;
            }
        }
        if(x==0 && y==0) return true;
        return false;

    }
    public boolean judgeCircle(String moves) {
        return check(moves);
    }
}