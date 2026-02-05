class Solution {
    // Main class required by LeetCode

    public int maxProfit(int[] prices) {
        // Method to find maximum profit from one buy and one sell

        int buy = prices[0];
        // Store the minimum buying price (initially first day price)

        int profit = 0;
        // Store the maximum profit found so far

        for (int i = 0; i < prices.length; i++) {
            // Loop through each day's price

            if (prices[i] < buy) {
                // If current price is lower than buying price

                buy = prices[i];
                // Update buying price to lower value
            } else if (prices[i] - buy > profit) {
                // If selling today gives more profit than before

                profit = prices[i] - buy;
                // Update maximum profit
            }
        }

        return profit;
        // Return the maximum profit
    }
}
