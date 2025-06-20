class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         //create STACK
        Stack<Integer>helperStack=new Stack<Integer>();

        int n=temperatures.length;//length of temp
        int[]result=new int[n];//create array to keep distance and need to return it

       for(int idx=n-1;idx>=0;idx--){//iterating from REVERSE
              

              //pop ele is idx with a lower or equal
              //temp than the curr idx
          while(!helperStack.isEmpty() && temperatures[idx]>=temperatures[helperStack.peek()]){
            helperStack.pop(); //remove it
          }
            
            //if stack still has ele
            //then next warm temp exists
          if(!helperStack.isEmpty()){
            result[idx]=helperStack.peek()-idx;//to get distance Diff of idx
          }
           
           //inserting curr idx in stack
          helperStack.push(idx);
       }
       return result;//returing the array which has diatance
    }
}