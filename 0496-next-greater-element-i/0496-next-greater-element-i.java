class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          if (nums2.length == 0 || nums1.length == 0)
            return new int[0];

        Map<Integer, Integer> NGE = new HashMap<>();//to store Next Great Ele
        Stack<Integer> numStack = new Stack<>();//to return most recent ele

        for (int i = nums2.length - 1; i >= 0; i--) {
            int ele = nums2[i];//looping nums2 from end

            // Pop all elements smaller than or equal to current
            while (!numStack.isEmpty() && numStack.peek() <= ele) {
                numStack.pop();
            }

            // If stack is empty, no greater element
            if (numStack.isEmpty()) {
                NGE.put(ele, -1);//return -1 if epty
            } else {
                NGE.put(ele, numStack.peek());//if not empty put the top ele
            }

            // Push current element to stack
            numStack.push(ele);
        }

        // Build the result for nums1 using the map
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = NGE.get(nums1[i]);
        }

        return res;
    }
}