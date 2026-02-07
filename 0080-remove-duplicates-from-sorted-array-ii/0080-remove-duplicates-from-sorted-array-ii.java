class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;   // index to place valid elements

        for (int i = 0; i < nums.length; i++) {

            // always allow first two elements,
            // after that, allow only if different from nums[k-2]
            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
