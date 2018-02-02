package 剑指offer;

import java.util.Stack;

public class a04_用两个栈实现队列 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty())
            throw new RuntimeException("Queue is empty!");
        if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}