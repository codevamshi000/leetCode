class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>helperStack=new Stack<Integer>();

        int n=temperatures.length;
        int[]result=new int[n];

       for(int idx=n-1;idx>=0;idx--){

          while(!helperStack.isEmpty() && temperatures[idx]>=temperatures[helperStack.peek()]){
            helperStack.pop(); //remove it
          }

          if(!helperStack.isEmpty()){
            result[idx]=helperStack.peek()-idx;
          }

          helperStack.push(idx);
       }
       return result;
    }
}