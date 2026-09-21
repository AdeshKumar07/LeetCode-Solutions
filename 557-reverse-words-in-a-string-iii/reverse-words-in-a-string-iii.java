class Solution {

    public static void rev(char[] ch, int s, int e){
        while(s<=e){
            char temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
    }
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();

        int st=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                rev(ch,st,i-1);
                st=i+1;
            }
        }
        rev(ch,st,s.length()-1);
        return new String(ch);


        
    }
}