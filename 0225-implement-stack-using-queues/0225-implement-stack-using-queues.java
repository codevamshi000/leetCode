/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

class MyStack {
    Queue<Integer>queue;

    public MyStack() {
        queue=new LinkedList();
    }
    
    public void push(int x) {
        queue.add(x);
        int size=queue.size();

        for(int i=0;i<size-1;i++){
            queue.add(queue.poll());
            //poll() removed and returned the first element 
        }
    }
    
    public int pop() {
      return queue.poll();  
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

