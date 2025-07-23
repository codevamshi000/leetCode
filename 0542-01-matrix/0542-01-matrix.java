import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] result = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Enqueue all 0s and mark 1s as -1 (unvisited)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    result[i][j] = -1;  // mark unvisited
                }
            }
        }

        // Step 2: 4 directions: right, down, left, up
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        // Step 3: BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check bounds and if cell is unvisited
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && result[newRow][newCol] == -1) {
                    result[newRow][newCol] = result[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return result;
    }
}
