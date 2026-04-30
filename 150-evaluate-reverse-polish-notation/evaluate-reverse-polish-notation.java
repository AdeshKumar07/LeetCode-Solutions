class Solution {
    static int cal(int l,int r, String s){
        if(s.equals("*")) return l*r;
        else if(s.equals("/")) return l/r;
        else if(s.equals("-")) return l-r;
        else if(s.equals("+")) return l+r;
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int r=st.pop();
                int l=st.pop();
                int res=cal(l,r,s);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}