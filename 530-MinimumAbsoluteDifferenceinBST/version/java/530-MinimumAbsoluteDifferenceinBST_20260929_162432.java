// Last updated: 9/29/2026, 4:24:32 PM
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
17    int min=Integer.MAX_VALUE;
18    Integer prev=null;
19    
20    public int getMinimumDifference(TreeNode root) {
21        inorder(root);
22
23        return min;
24    }
25    void inorder(TreeNode root){
26        if(root==null)
27        return;
28
29        inorder(root.left);
30
31        if(prev!=null){
32            min=Math.min(min,root.val-prev);
33        }
34
35        prev=root.val;
36        inorder(root.right);
37    }
38}