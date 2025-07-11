class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;//since ans may be large return in MOD(given in ques)
        long result = 0;

        // Arrays to store Previous Less Element (PLE) and Next Less Element (NLE) distances
        int[] left = new int[n];  // number of elements greater than arr[i] on left
        int[] right = new int[n]; // number of elements greater than or equal on right

        Stack<Integer> stack = new Stack<>();

        // Step 1: Fill left[]
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        // Clear stack for reuse
        stack.clear();

        // Step 2: Fill right[]
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }

        // Step 3: Compute result
        for (int i = 0; i < n; i++) {
            //we use long bcoz this primitive type can store large int
            long contribution = (long) arr[i] * left[i] * right[i];
            result = (result + contribution) % MOD;//to avoid INT flow coz we dealing with large num
        }

        return (int) result;
    }
}
