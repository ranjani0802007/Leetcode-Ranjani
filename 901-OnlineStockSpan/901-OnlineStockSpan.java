// Last updated: 8/28/2026, 9:24:20 AM
1import java.util.*;
2
3class Solution {
4    public boolean validateStackSequences(int[] pushed, int[] popped) {
5        Stack<Integer> stack = new Stack<>();
6
7        int j = 0;
8
9        for (int x : pushed) {
10            stack.push(x);
11
12            while (!stack.isEmpty() && 
13                   j < popped.length && 
14                   stack.peek() == popped[j]) {
15                stack.pop();
16                j++;
17            }
18        }
19
20        return stack.isEmpty();
21    }
22}