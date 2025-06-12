class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int point=0;
        for(int i=0;i<nums.length;i++){
            if(point==0){
                can=nums[i];
            }if(can==nums[i]){
                point++;
            }else{
                point--;
            }
        }
        return can;
    }
}