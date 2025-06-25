class StockSpanner {
   //pair of (Price of stock,SPAN)
   Stack<int[]> stack;
    /*Example: stack.push(new int[]{100, 1}) means:
       Day's price = 100
       Span = 1 (no previous prices are less than/equal to it)*/
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
            // While current price >= previous price, pop and accumulate span
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */