import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int islands = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        // Direction vectors for moving up, down, left, right
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    
                    // Start BFS
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{r, c});
                    grid[r][c] = '0'; // Mark as visited immediately to avoid duplicate queuing
                    
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int currRow = cell[0];
                        int currCol = cell[1];
                        
                        // Explore all 4 neighbors
                        for (int[] dir : directions) {
                            int nextRow = currRow + dir[0];
                            int nextCol = currCol + dir[1];
                            
                            // Check boundary conditions and if neighbor is unvisited land
                            if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && grid[nextRow][nextCol] == '1') {
                                queue.offer(new int[]{nextRow, nextCol});
                                grid[nextRow][nextCol] = '0'; // Mark as visited
                            }
                        }
                    }
                }
            }
        }
        
        return islands;
    }
}
