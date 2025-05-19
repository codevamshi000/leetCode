class Solution {
    public void rotate(int[] nums, int k) {
        // k mod length of array if k is bigger vthen length we do it
        k %= nums.length;//if k= given eles are > nums so we can half% and rotate it instaed of all num.

        reverse(nums, 0, nums.length - 1);/*1st reverse the array*/

        reverse(nums, 0, k - 1);/* reverse the k ele */

        reverse(nums, k, nums.length - 1);  /* reverse k to last ele */
    } /* function for start and end index */
    public void reverse(int[] nums, int start, int end) {
        /* traverse the array */
        while (start <= end) { 
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;/* for forward */
            end--;/*for backward*/
        }
    }
}