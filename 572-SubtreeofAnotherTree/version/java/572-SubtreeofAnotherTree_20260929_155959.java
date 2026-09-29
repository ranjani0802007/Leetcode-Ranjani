// Last updated: 9/29/2026, 3:59:59 PM
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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18        if(subRoot == null)
19        return true;
20
21        if(root == null)
22        return false;
23
24        if(sameTree(root,subRoot))
25        return true;
26
27        return isSubtree(root.left,subRoot)||isSubtree(root.right, subRoot);
28    }
29    public boolean sameTree(TreeNode a,TreeNode b){
30        if(a==null && b==null)
31        return true;
32
33        if(a==null || b==null)
34        return false;
35
36        if(a.val!=b.val)
37        return false;
38
39        return sameTree(a.left,b.left)&&sameTree(a.right,b.right);
40    }
41}