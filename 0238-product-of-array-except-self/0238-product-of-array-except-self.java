class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int [] ans=new int[n]; //to store the answer
      int ProdL=1;
      // in multip it doesnt chance value like 0 we keep we get the anser as 0
      int ProdR=1;//6*1=6[so we kept as 1 instead of 0]
    
    //1st write prod of right side
      for(int i =n-1;i>=0;i--){ //from last to first since its reverse loop
        ans[i] = ProdR;//ans will be i prod of ele right side storing in output array
         ProdR=ProdR*nums[i];
      }   
     // 2nd loop for left side

     for(int i=0;i<n;i++){
        ans[i]=ans[i]*ProdL;//we use ans[i] here bcos we found it in right so v use it here
        ProdL=ProdL*nums[i];
     }

     return ans;
    }
}