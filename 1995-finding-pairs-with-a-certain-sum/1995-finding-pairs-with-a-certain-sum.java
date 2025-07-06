class FindSumPairs {
    int[] nums1, nums2;
    Map<Integer, Integer> map2; // frequency map for nums2

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map2 = new HashMap<>();

        // Build frequency map for nums2
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        // Decrease old value frequency
        map2.put(oldVal, map2.get(oldVal) - 1);
        if (map2.get(oldVal) == 0) {
            map2.remove(oldVal);
        }

        // Update nums2
        nums2[index] = newVal;

        // Increase new value frequency
        map2.put(newVal, map2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;

        for (int num : nums1) {
            int complement = tot - num;
            count += map2.getOrDefault(complement, 0);
        }

        return count;
    }
}
