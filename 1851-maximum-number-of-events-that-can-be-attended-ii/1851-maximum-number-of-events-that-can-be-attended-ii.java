class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]); // sort by start time

        int n = events.length;
        Integer[][] memo = new Integer[n][k + 1];

        return dfs(0, k, events, memo);
    }

    private int dfs(int i, int k, int[][] events, Integer[][] memo) {
        if (i == events.length || k == 0) return 0;
        if (memo[i][k] != null) return memo[i][k];

        // Option 1: Skip current event
        int skip = dfs(i + 1, k, events, memo);

        // Option 2: Attend current event
        int next = findNext(events, events[i][1]);
        int attend = events[i][2] + dfs(next, k - 1, events, memo);

        return memo[i][k] = Math.max(skip, attend);
    }

    // Binary search to find the next non-overlapping event
    private int findNext(int[][] events, int currentEnd) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] > currentEnd) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
