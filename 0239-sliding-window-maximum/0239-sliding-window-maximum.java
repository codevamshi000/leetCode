import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1]; // to store the answer
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices
        int ri = 0; // index for result array

        for (int i = 0; i < n; i++) {
            // Step 1: Remove out-of-window elements (left side)
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Step 2: Remove all smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Step 3: Add current index to deque
            deque.offerLast(i);

            // Step 4: If window is formed, store the max (at front of deque)
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
