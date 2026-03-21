class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int l=0,maxf=0,maxl=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(i)-'A']);
            while((i-l+1)-maxf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxl=Math.max(maxl,i-l+1);
        }
        return maxl;
    }
}    