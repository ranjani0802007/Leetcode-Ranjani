// Last updated: 8/22/2026, 11:06:05 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5
6        List<Integer> ans = new ArrayList<>();
7
8        int top = 0;
9        int bottom = matrix.length - 1;
10        int left = 0;
11        int right = matrix[0].length - 1;
12
13        while (top <= bottom && left <= right) {
14
15            for (int i = left; i <= right; i++)
16                ans.add(matrix[top][i]);
17
18            top++;
19
20            for (int i = top; i <= bottom; i++)
21                ans.add(matrix[i][right]);
22
23            right--;
24
25            if (top <= bottom) {
26                for (int i = right; i >= left; i--)
27                    ans.add(matrix[bottom][i]);
28
29                bottom--;
30            }
31
32            if (left <= right) {
33                for (int i = bottom; i >= top; i--)
34                    ans.add(matrix[i][left]);
35
36                left++;
37            }
38        }
39
40        return ans;
41    }
42}