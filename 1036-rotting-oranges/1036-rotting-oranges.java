import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        // Step 1: Add all rotten oranges to queue and count fresh ones
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // No fresh oranges to rot
        if (freshOranges == 0) return 0;

        // Directions: right, down, left, up
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int minutes = 0;

        // Step 2: BFS – spread the rot minute by minute
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean hasNewRot = false;

            for (int i = 0; i < size; i++) {
                int[] orange = queue.poll();
                int row = orange[0];
                int col = orange[1];

                // Try all 4 directions
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    // Check boundaries and if it's a fresh orange
                    if (newRow >= 0 && newRow < rows &&
                        newCol >= 0 && newCol < cols &&
                        grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2; // Rot it
                        queue.add(new int[]{newRow, newCol});
                        freshOranges--;
                        hasNewRot = true;
                    }
                }
            }

            // Only increment time if new oranges were rotted this round
            if (hasNewRot) minutes++;
        }

        // If all fresh oranges are rotted, return time. Else, -1.
        return freshOranges == 0 ? minutes : -1;
    }
}
