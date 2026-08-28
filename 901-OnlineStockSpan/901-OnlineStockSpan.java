// Last updated: 8/28/2026, 9:22:32 AM
1import java.util.*;
2
3class StockSpanner {
4
5    Stack<int[]> stack;
6
7    public StockSpanner() {
8        stack = new Stack<>();
9    }
10
11    public int next(int price) {
12        int span = 1;
13
14        while (!stack.isEmpty() && stack.peek()[0] <= price) {
15            span += stack.pop()[1];
16        }
17
18        stack.push(new int[]{price, span});
19
20        return span;
21    }
22}