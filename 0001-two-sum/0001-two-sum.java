class Solution { 
    // Main class required by LeetCode

    public int[] twoSum(int[] nums, int target) { 
        // Method to find two indices whose values add up to target

        HashMap<Integer, Integer> complex = new HashMap<>();
        // HashMap to store (neededNumber, index)

        for (int i = 0; i < nums.length; i++) {
            // Loop through each element in the array

            Integer complexInt = complex.get(nums[i]);
            // Check if current number exists as a needed number in HashMap

            if (complexInt != null) {
                // If found, it means we already saw the other number

                return new int[]{i, complexInt};
                // Return indices of the two numbers
            }

            complex.put(target - nums[i], i);
            // Store the number needed to reach target with current index
        }

        return nums;
        // Return statement (not actually used in valid LeetCode input)
    }
}
