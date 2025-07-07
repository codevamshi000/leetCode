import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        // Step 1: Sort events by start day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap to store event end days
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0, res = 0, day = 0;
        int n = events.length;

        // Step 2: Process day by day
        while (i < n || !minHeap.isEmpty()) {
            // If no events are in the heap, move to the next available start day
            if (minHeap.isEmpty()) {
                day = events[i][0];
            }

            // Step 3: Add all events that start today
            while (i < n && events[i][0] <= day) {
                minHeap.offer(events[i][1]); // add end day
                i++;
            }

            // Step 4: Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Step 5: Attend one event (if possible)
            if (!minHeap.isEmpty()) {
                minHeap.poll(); // attend the event with earliest end day
                res++;
            }

            day++; // Move to the next day
        }

        return res;
    }
}
