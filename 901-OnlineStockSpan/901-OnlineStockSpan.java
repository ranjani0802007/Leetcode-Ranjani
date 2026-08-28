// Last updated: 8/28/2026, 9:26:04 AM
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5        Stack<Integer> stack = new Stack<>();
6
7        int num = 0;
8        char sign = '+';
9
10        for (int i = 0; i < s.length(); i++) {
11            char c = s.charAt(i);
12
13            if (Character.isDigit(c)) {
14                num = num * 10 + (c - '0');
15            }
16
17            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
18
19                if (sign == '+') {
20                    stack.push(num);
21                } 
22                else if (sign == '-') {
23                    stack.push(-num);
24                } 
25                else if (sign == '*') {
26                    stack.push(stack.pop() * num);
27                } 
28                else if (sign == '/') {
29                    stack.push(stack.pop() / num);
30                }
31
32                sign = c;
33                num = 0;
34            }
35        }
36
37        int result = 0;
38
39        for (int x : stack) {
40            result += x;
41        }
42
43        return result;
44    }
45}