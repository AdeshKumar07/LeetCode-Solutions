class Solution {
    static boolean check(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
    public boolean isValid(String s) {
        if(s.length()%2 != 0) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x == '{' || x == '[' || x=='('){
                st.push(x);

            }
            else{
                if(st.isEmpty()) return false;
                if(check(st.peek(),x)) st.pop();
                else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
        
    }
}