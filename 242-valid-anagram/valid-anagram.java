class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] st1=s.toCharArray();
        char[] st2=t.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        return Arrays.equals(st1,st2);
    }
}