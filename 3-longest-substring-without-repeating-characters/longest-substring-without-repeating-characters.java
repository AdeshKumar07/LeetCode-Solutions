class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Set<Character> window = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            while (window.contains(currentChar)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(currentChar);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}