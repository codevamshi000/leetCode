class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complex=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           Integer complexInt= complex.get(nums[i]);
           if(complexInt !=null){
            return new int[]{i,complexInt};
           }
           complex.put(target-nums[i], i);
        }
        return nums;
    }
}