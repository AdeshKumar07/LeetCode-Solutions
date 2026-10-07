class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int right = arr.length - k;

        while (left < right) {

            if (x - arr[left] > arr[left + k] - x) {
                left++;
            } else {
                right--;
            }
        }

        for (int i = left; i < left + k; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}