class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        char[] st=s.toCharArray();
        char[] tt=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        return Arrays.equals(st,tt);              
    }
}