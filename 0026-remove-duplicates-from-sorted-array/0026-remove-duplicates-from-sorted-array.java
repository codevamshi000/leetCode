class Solution {
    public int removeDuplicates(int[] nums) {

        // k points to the last unique element index
        int k = 0;

        // j scans the array from start to end
        for (int j = 0; j < nums.length; j++) {

            // if current element is different from last kept one
            if (nums[k] != nums[j]) {

                // move k forward and place the new unique element
                nums[++k] = nums[j];
            }
        }

        // length of array with unique elements
        return ++k;
    }
}
