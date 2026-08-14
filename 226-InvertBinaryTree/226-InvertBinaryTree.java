// Last updated: 8/14/2026, 11:59:39 AM
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}