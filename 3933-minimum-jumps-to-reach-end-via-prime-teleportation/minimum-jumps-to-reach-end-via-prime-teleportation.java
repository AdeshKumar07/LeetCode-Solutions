class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;
        int maxVal = 0;
        for (int num : nums) maxVal = Math.max(maxVal, num);
        int[] spf = new int[maxVal + 1];
        for (int i = 2; i <= maxVal; i++) {
            if (spf[i] == 0) {
                for (int j = i; j <= maxVal; j += i) if (spf[j] == 0) spf[j] = i;
            }
        }
        Map<Integer, List<Integer>> primeToIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            while (temp > 1) {
                int p = spf[temp];
                primeToIndices.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
                while (temp % p == 0) temp /= p;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        q.offer(0);
        visited[0] = true;
        int jumps = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr == n - 1) return jumps;
                for (int next : new int[]{curr - 1, curr + 1}) {
                    if (next >= 0 && next < n && !visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
                int val = nums[curr];
                if (val >= 2 && spf[val] == val) {
                    List<Integer> targets = primeToIndices.remove(val);
                    if (targets != null) {
                        for (int next : targets) {
                            if (!visited[next]) {
                                visited[next] = true;
                                q.offer(next);
                            }
                        }
                    }
                }
            }
            jumps++;
        }
        return -1;
    }
}
