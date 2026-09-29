// Last updated: 9/29/2026, 4:06:20 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int tilt=0;
18
19    public int findTilt(TreeNode root) {
20        sum(root);
21        return tilt;
22    }
23    public int sum(TreeNode root){
24        if(root==null)
25        return 0;
26
27        int left=sum(root.left);
28        int right=sum(root.right);
29
30        tilt+=Math.abs(left-right);
31        return left+right+root.val;
32    }
33}