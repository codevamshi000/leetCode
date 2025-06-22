class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //create stack
        Stack<Integer>stack=new Stack<Integer>();
        //ioop iterate into giving array
        for(int asteroid : asteroids){
            boolean destroyed=false;//to track

         //conditions of collisions
        while(!stack.isEmpty() && asteroid <0 &&stack.peek() >0){
            if(stack.peek() < -asteroid){
                stack.pop();
            } else if(stack.peek() == -asteroid){
                stack.pop();
                destroyed=true;
                break;
            } else{
                destroyed = true;
                break;
            }
        }    

         if(!destroyed){
            stack.push(asteroid);
         }
        }

        int result[]=new int[stack.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
}