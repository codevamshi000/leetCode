class MyCircularQueue {
//add class variables
private int[]queue;   // array to hold queue elements
private int front;      // index of the front element
private int rear;       // index of the rear (last) element
private int size;       // current number of elements

    public MyCircularQueue(int k) {
     //Constructor
     queue=new int[k];   //create array of size k
     front=0;            //start front at indx 0
     rear=-1;            //rear is -1 bcoz no ele yet
     size=0;             //initial size=0    
    }
    
    public boolean enQueue(int value) {
       if(isFull())return false;
    
       rear=(rear+1)% queue.length;
        queue[rear]=value;
    size++;
    return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front=(front+1)%queue.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */