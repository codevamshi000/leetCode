class MinStack {
      Stack<Integer> stack ;
      Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
       int removed = stack.pop();  // Always pop from the main stack
        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();  // Only pop from minStack if it's the current minimum
        }
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
       return minStack.peek();// Return the current minimum

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */