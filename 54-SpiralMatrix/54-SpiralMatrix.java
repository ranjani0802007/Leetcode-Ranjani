// Last updated: 8/22/2026, 11:06:53 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] matrix = new int[n][n];
5
6        int top = 0, bottom = n - 1;
7        int left = 0, right = n - 1;
8        int value = 1;
9
10        while (top <= bottom) {
11
12            for (int i = left; i <= right; i++)
13                matrix[top][i] = value++;
14
15            top++;
16
17            for (int i = top; i <= bottom; i++)
18                matrix[i][right] = value++;
19
20            right--;
21
22            if (top <= bottom) {
23                for (int i = right; i >= left; i--)
24                    matrix[bottom][i] = value++;
25
26                bottom--;
27            }
28
29            if (left <= right) {
30                for (int i = bottom; i >= top; i--)
31                    matrix[i][left] = value++;
32
33                left++;
34            }
35        }
36
37        return matrix;
38    }
39}