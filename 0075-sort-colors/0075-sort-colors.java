class Solution {
    public void sortColors(int[] nums) { 
        int start=0;
        int end=nums.length-1;
        int ind=0;

        while(ind <= end && start<end){
           if(nums[ind]==0){
            //now swap it if its 0's
            int temp=nums[ind];
            nums[ind]=nums[start];
            nums[start]=temp;
            start++;
            ind++;

           } else if(nums[ind]==2){
            //now swap it if its 2's
            int temp=nums[ind];
            nums[ind]=nums[end];
            nums[end]=temp;
            end--;
           }else{
            //if nums[ind]==1 increase its ind
            ind++; // this is for 1's
           }
        }
    }
}