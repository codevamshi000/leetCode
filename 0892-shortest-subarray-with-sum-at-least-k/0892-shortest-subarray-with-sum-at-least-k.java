//O(n) using prefix + monotonic deque
import java.util.*;

public class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];// we take prefix 

        for (int i = 0; i < n; ++i) {//1st we take value after we incre so(++i)
            prefix[i + 1] = prefix[i] + nums[i];//now we build PREFIX sum
        }
         
        int res = n + 1;//Start with a value larger than any possible subarray length
        Deque<Integer> deque = new ArrayDeque<>();//created DEQUE

        for (int i = 0; i < prefix.length; ++i) {
while (!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
//Find all valid subarrays ending at index i whose sum is ≥ k, 
//and update the shortest length (res).         
                res = Math.min(res, i - deque.pollFirst());
            }

 while (!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]) {
//Maintain the deque in strictly increasing order of prefix values.            
                deque.pollLast();
            }

            deque.addLast(i);
        }

        return res <= n ? res : -1;//Return result if found, else return -1
    }
}
