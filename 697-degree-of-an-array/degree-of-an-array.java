class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int degree = 0;
        int minLen = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            first.putIfAbsent(num, i);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > degree) {
                degree = freq.get(num);
                minLen = i - first.get(num) + 1;
            } else if (freq.get(num) == degree) {
                minLen = Math.min(minLen, i - first.get(num) + 1);
            }
        }

        return minLen;
    }
}
