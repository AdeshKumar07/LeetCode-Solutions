class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int number=0;
        char op='+';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                number=(number*10)+(c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==s.length()-1){
                if(op=='+'){
                    st.push(number);
                }
                else if(op=='-'){
                    st.push(-1*number);
                }
                else if(op=='*'){
                    st.push(number*st.pop());
                }
                else if(op=='/'){
                    st.push(st.pop()/number);
                }
                number=0;
                op=c;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}