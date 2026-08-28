// Last updated: 8/28/2026, 9:52:27 AM
1class Solution {
2
3    int maxSum = Integer.MIN_VALUE;
4
5    public int maxPathSum(TreeNode root) {
6        dfs(root);
7        return maxSum;
8    }
9
10    private int dfs(TreeNode node) {
11
12        if (node == null) {
13            return 0;
14        }
15
16        int left = Math.max(0, dfs(node.left));
17        int right = Math.max(0, dfs(node.right));
18
19        // Path passing through current node
20        int current = node.val + left + right;
21
22        maxSum = Math.max(maxSum, current);
23
24        // Return one side to parent
25        return node.val + Math.max(left, right);
26    }
27}