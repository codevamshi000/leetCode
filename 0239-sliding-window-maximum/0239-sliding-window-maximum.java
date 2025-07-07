class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]result=new int[n-k+1];//final answ array
        Deque<Integer> deque=new ArrayDeque<>();//stores only indx

        for(int i=0;i<n;i++){
           // 1. Remove elements out of window from the front
            if(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
             // 2. Remove all smaller elements from the back
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
           // 3. Add current index to deque
            deque.offerLast(i);
             // 4. Save result when we have the first complete window
            if(i>=k-1){
                result[i-k+1]=nums[deque.peekFirst()];// max value of current window
            }
        }
        return result;
    }
}