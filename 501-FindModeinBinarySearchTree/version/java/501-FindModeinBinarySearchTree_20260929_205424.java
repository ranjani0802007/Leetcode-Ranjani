// Last updated: 9/29/2026, 8:54:24 PM
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
17    List<Integer> result=new ArrayList<>();
18    int currentCount=0;
19    int maxCount=0;
20    Integer prev=null;
21
22    public int[] findMode(TreeNode root) {
23        inorder(root);
24        int[] ans=new int[result.size()];
25
26        for(int i=0;i<result.size();i++){
27            ans[i]=result.get(i);
28        }
29        return ans;
30    }
31    void inorder(TreeNode root){
32        if(root==null)
33        return;
34
35        inorder(root.left);
36
37        if(prev!=null && prev==root.val){
38            currentCount++;
39        }
40        else{
41            currentCount=1;
42        }
43        if(currentCount>maxCount){
44            result.clear();
45            result.add(root.val);
46            maxCount=currentCount;
47        }
48        else if(currentCount==maxCount){
49            result.add(root.val);
50        }
51        prev=root.val;
52        inorder(root.right);
53    }
54}