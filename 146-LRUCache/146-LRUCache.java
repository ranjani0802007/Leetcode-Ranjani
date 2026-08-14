// Last updated: 8/14/2026, 12:32:36 PM
1class MinStack {
2
3    Stack<Integer> stack = new Stack<>();
4    Stack<Integer> minStack = new Stack<>();
5
6    public MinStack() {
7    }
8
9    public void push(int val) {
10        stack.push(val);
11
12        if (minStack.isEmpty() || val <= minStack.peek())
13            minStack.push(val);
14    }
15
16    public void pop() {
17        if (stack.peek().equals(minStack.peek()))
18            minStack.pop();
19
20        stack.pop();
21    }
22
23    public int top() {
24        return stack.peek();
25    }
26
27    public int getMin() {
28        return minStack.peek();
29    }
30}