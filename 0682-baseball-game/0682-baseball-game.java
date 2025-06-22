class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop(); // Remove last valid score
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2); // Double last valid score
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);       // Push the first back
                stack.push(newTop);    // Push the sum
            } else {
                stack.push(Integer.parseInt(op)); // Normal score
            }
        }

        int totalScore = 0;
        for (int score : stack) {
            totalScore += score;
        }

        return totalScore;
    }
}
