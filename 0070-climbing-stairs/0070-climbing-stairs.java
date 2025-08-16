class Solution {
    public int climbStairs(int n) {
        int prev2=1;//we dont start from 0 bcoz 0 stairs do ntg 
        int prev1=1;//so to climb stair we start from 1
        if(n<=1) return 1; //base case

        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;// dp[i] = dp[i-1] + dp[i-2]
            prev2=prev1; // shift window: new (i-2) becomes old (i-1)
            prev1=curr;  // new (i-1) becomes dp[i]
        }
        return prev1; // dp[n]
    }
}