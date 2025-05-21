class Solution {
    public int longestValidParentheses(String s) {
        int left=0;
        int right=0;
        int max=0;

        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){ // checking wheasther staring bracxket is left or right
                left++; //then inc left counter
          }else{
            right++; // increament in right
          }
          if(left == right){ //if both are equal we change the MAX value
            max=Math.max(max,left*2);// it [ checks that max is greater or left*2] is greater
          }else if(right>left){
            left=0; // if right is greater than left then we reset all 
            right=0;// "(" This is left brack to get brack 1st we should get left brack
                    // so if we get right brack 1st we simply reset it
          }
        }
         left=0;
         right=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){ // checking wheasther staring bracxket is left or right
                left++; //then inc left counter
          }else{
            right++; // increament in right
          }
          if(left == right){ //if both are equal we change the MAX value
            max=Math.max(max,left*2);// it [ checks that max is greater or left*2] is greater
          }else if(left>right){
            left=0; // if right is greater than left then we reset all 
            right=0;// "(" This is left brack to get brack 1st we should get left brack
                    // so if we get right brack 1st we simply reset it
          }
        }
        return max;
    }
}