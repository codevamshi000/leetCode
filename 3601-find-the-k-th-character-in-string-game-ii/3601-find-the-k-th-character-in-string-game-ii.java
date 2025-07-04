class Solution {
    public char kthCharacter(long k, int[] operations) {
        int opsCount = (int) Math.ceil(Math.log(k) / Math.log(2));
        int totalShifts = 0;

        for (int i = opsCount - 1; i >= 0; i--) {
            long half = 1L << i;
            if (k > half) {
                k -= half;
                totalShifts += operations[i];
            }
        }
        return (char) ('a' + totalShifts % 26);
    }
}