class Solution {
    public int searchInsert(int[] nums, int target) {

         int start=0; //starting indx
         int end=nums.length-1;// last index
  
  while(start<=end){ //condition
    int mid=(start+end)/2; //mid indx
    if(nums[mid]==target){ 
         return mid;
    } else if(nums[mid] > target){
        end=mid-1;
    }else{
        start=mid+1;
    }
  }
  return start;
    }
}