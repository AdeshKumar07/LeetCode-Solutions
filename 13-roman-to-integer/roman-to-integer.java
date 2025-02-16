class Solution {
    private static int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;    
        }
    }
    public int romanToInt(String s) {
       int t=0;
       int p=0;
       for(int i=s.length()-1;i>=0;i--){
        int c=getValue(s.charAt(i));
        if(c<p){
            t=t-c;
        }
        else{
            t=t+c;
        }
        p=c;
       } 
       return t;
    }
}