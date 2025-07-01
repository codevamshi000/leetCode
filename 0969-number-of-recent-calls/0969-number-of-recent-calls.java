class RecentCounter {
     private Queue<Integer> q;//1st create a QUEUE

    public RecentCounter() {
       q=new LinkedList<>();//written in DSA-2 book
    }
    
    public int ping(int t) {
        q.add(t);while(q.peek() < t-3000){
            q.poll();//Use poll() → When queue may be empty (safe and preferred)
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */