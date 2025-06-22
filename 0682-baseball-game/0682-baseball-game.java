class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop(); // Remove last score
                    break;
                case "D":
                    stack.push(stack.peek() * 2); // Double last score
                    break;
                case "+":
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int sum = last + secondLast;
                    stack.push(last); // push back last
                    stack.push(sum);  // push sum of last 2
                    break;
                default:
                    stack.push(Integer.parseInt(op)); // Add new score
            }
        }

        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }
}
