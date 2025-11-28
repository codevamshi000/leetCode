class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int candidate1=0, candidate2=0;//possible majority elements  
      int count1=0,count2=0;//their respective vote counts
      // 1st pass → find two possible candidates
      for(int num:nums){
        if(num == candidate1){
              count1++;
        }else if(num == candidate2){
            count2++;
        }else if(count1==0){
            candidate1=num;
            count1=1;
        }else if(count2==0){
            candidate2=num;
            count2=1;
        }else{
            count1--;
            count2--;
        }
      }

      //2nd pass -candidates to confirm they appear more than n/3 times.
      count1=0;
      count2=0;
        
        for(int num:nums){
            if(num == candidate1)count1++;
            else if(num == candidate2)count2++;
        }
      
      List<Integer>ans=new ArrayList<>();
      int n=nums.length;

      if(count1 >n/3)ans.add(candidate1);
      if(count2 >n/3)ans.add(candidate2);

      return ans;
    }
}