// Last updated: 8/14/2026, 12:02:06 PM
class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}