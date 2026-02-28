class Solution {
    public String addBinary(String a, String b) {
        int n=a.length();
        int m=b.length();
        if(n<m){
            return addBinary(b,a);
        }

        int j = m-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            int bit1=a.charAt(i)-'0';
            int sum = bit1+carry;

            if(j>=0){
                int bit2=b.charAt(j) - '0';
                sum += bit2;
                j--;
            }

            int bit = sum % 2;
            carry = sum / 2;
            ans.append((char) (bit+'0'));
        }
        if(carry > 0 ){
            ans.append('1');

        }
        return ans.reverse().toString();
    }
}