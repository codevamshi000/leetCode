class Solution {
    public int majorityElement(int[] nums) {
        int can = 0;     // candidate
        int point = 0;   // count

        for(int i = 0; i < nums.length; i++){
            if(point == 0){//If count becomes zero, choose a new candidate.
                can = nums[i];
            } 
            if(can == nums[i]){
                point++;
                //If current element equals candidate → vote increases
              //Else → vote decreases
            } else {
                point--;
            }
        }
        return can;  
    }
}
