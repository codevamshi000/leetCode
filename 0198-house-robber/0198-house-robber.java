class Solution {
    public int rob(int[] nums) {
       int n=nums.length;

       if(n==1){
        return nums[0];
       }

       int[]dp=new int[n];//create DP array

       dp[0]=nums[0];// Only house 0 available
       dp[1]=Math.max(nums[0],nums[1]); // Best of house 0 or house 1

       for(int i=2;i<n;i++){//start from 2 coz we already have 0 and 1
        dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);//rob i and add the best up to i-2
       }
       return dp[n-1];//The best for all houses.
    }
}