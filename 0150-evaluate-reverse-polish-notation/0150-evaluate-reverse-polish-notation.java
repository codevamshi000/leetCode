class Solution {
    public int evalRPN(String[] tokens) {
          Stack<Integer> st = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                if (token.equals("+")) {
                    st.push(a + b);
                } else if (token.equals("-")) {
                    st.push(a - b);
                } else if (token.equals("*")) {
                    st.push(a * b);
                } else if (token.equals("/")) {
                    st.push(a / b);
                }
            } else {
                // If the token is a number, push it onto the stack
                st.push(Integer.parseInt(token));
            }
        }
        
        // The final result will be the only element left in the stack
        return st.pop();
              
    }
}