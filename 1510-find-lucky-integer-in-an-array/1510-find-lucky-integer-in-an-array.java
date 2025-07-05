class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];  // because arr[i] <= 500

        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }

        // Check from 500 to 1 (to return the largest lucky number)
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;  // found the largest lucky number
            }
        }

        return -1;  // no lucky number found
    }
}
