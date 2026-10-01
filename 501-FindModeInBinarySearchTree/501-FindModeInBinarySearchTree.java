// Last updated: 10/1/2026, 9:38:30 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> result=new ArrayList<>();
    int currentCount=0;
    int maxCount=0;
    Integer prev=null;

    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans=new int[result.size()];

        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
    void inorder(TreeNode root){
        if(root==null)
        return;

        inorder(root.left);

        if(prev!=null && prev==root.val){
            currentCount++;
        }
        else{
            currentCount=1;
        }
        if(currentCount>maxCount){
            result.clear();
            result.add(root.val);
            maxCount=currentCount;
        }
        else if(currentCount==maxCount){
            result.add(root.val);
        }
        prev=root.val;
        inorder(root.right);
    }
}