class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // Since 1 <= arr[i] <= 500
        
        for (int num : arr) {
            freq[num]++;
        }
        
        int maxLucky = -1;
        for (int i = 1; i <= 500; i++) {
            if (freq[i] == i) {
                if (i > maxLucky) {
                    maxLucky = i;
                }
            }
        }
        
        return maxLucky;
    }
}