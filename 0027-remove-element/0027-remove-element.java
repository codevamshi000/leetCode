class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;   // index to place valid elements

        for (int i = 0; i < nums.length; i++) {

            // if current element is NOT the one to remove
            if (nums[i] != val) {
                nums[k] = nums[i]; // keep it
                k++;               // move to next free spot
            }
        }

        // k = count of elements kept
        return k;
    }
}
