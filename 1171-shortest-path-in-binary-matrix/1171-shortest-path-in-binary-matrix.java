import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        // Check if start or end is blocked
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
            return -1;
        }

        // Directions: 8 possible moves (up, down, left, right, and diagonals)
        int[][] directions = {
            {0, 1}, {1, 0}, {-1, 0}, {0, -1},
            {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
        };

        // Queue to hold current position: [row, col]
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        // Mark start cell with distance 1 (we use grid to store distances)
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];
            int distance = grid[row][col];

            // If we reach the bottom-right corner, return distance
            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            // Explore all 8 directions
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check bounds and whether the cell is unvisited and open (0)
                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == 0) {

                    queue.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = distance + 1; // Mark visited with distance
                }
            }
        }

        // If no path is found
        return -1;
    }
}
