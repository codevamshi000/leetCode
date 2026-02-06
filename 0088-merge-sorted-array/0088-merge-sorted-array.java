class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer to last valid element in nums1
        int i = m - 1;

        // Pointer to last element in nums2
        int j = n - 1;

        // Pointer to last position of nums1
        int k = m + n - 1;

        // Merge from the back to avoid overwriting
        while (j >= 0) {

            // If nums1 element is bigger, place it at the end
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;// Move the position pointer
                i--;
            } 
            // Otherwise, place nums2 element
            else {
                nums1[k] = nums2[j];
                k--;// Move the position pointer
                j--;
            }
        }
    }
}
