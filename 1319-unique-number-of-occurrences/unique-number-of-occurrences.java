import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr); // sort input array

        int[] v = new int[arr.length]; // to store frequencies
        int idx = 0; // index for freq array

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }
            v[idx++] = cnt; // store only actual frequencies
        }

        Arrays.sort(v, 0, idx); // sort only the part filled with frequencies

        // check for duplicate frequencies
        for (int i = 1; i < idx; i++) {
            if (v[i] == v[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
