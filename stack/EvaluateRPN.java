// Problem: Evaluate Reverse Polish Notation
// Pattern: Stack
// Difficulty: Medium
// Beats: 89.46%
// Independence: Guided thinking, self coded
// LeetCode: #150

import java.util.Stack;

class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = result.pop();
                int a = result.pop();
                result.push(a + b);
            } else if (token.equals("-")) {
                int b = result.pop();
                int a = result.pop();
                result.push(a - b);
            } else if (token.equals("*")) {
                int b = result.pop();
                int a = result.pop();
                result.push(a * b);
            } else if (token.equals("/")) {
                int b = result.pop();
                int a = result.pop();
                result.push(a / b);
            } else
                result.push(Integer.parseInt(token));
        }
        return result.pop();
    }
}