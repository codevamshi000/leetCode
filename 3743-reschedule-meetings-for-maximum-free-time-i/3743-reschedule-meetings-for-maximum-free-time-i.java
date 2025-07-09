class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;

        // Step 1: Store meetings as [start, end] pairs
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = startTime[i];
            meetings[i][1] = endTime[i];
        }

        // Step 2: Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Step 3: Build array of gaps (free times)
        // Number of gaps = n + 1: before first meeting, between meetings, after last meeting
        int[] gaps = new int[n + 1];

        // Gap before the first meeting
        gaps[0] = meetings[0][0]; // from time 0 to first meeting start

        // Gaps between meetings
        for (int i = 1; i < n; i++) {
            gaps[i] = meetings[i][0] - meetings[i - 1][1];
        }

        // Gap after the last meeting
        gaps[n] = eventTime - meetings[n - 1][1];

        // Step 4: Use sliding window of size (k+1) to find maximum sum of adjacent gaps
        int maxFree = 0, windowSum = 0;
        for (int i = 0; i < gaps.length; i++) {
            windowSum += gaps[i];

            // Shrink window if size exceeds k+1
            if (i >= k + 1) {
                windowSum -= gaps[i - (k + 1)];
            }

            // Update max when window size is valid
            if (i >= k) {
                maxFree = Math.max(maxFree, windowSum);
            }
        }

        return maxFree;
    }
}
