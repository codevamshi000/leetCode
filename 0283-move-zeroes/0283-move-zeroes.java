class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos=0;
         
           // Step 1: Move all non-zero numbers to the front
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
              nums[insertPos++]=nums[i];
            }
        }
          
            // Step 2: Fill the rest of the array with 0s
            //looping from oth indx(INSERTPOS) to last indx   
             while(insertPos< nums.length){
                  nums[insertPos++]=0;
             }
    }
}