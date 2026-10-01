// Last updated: 10/1/2026, 9:39:28 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "null";
        }
        return root.val + "," +
           serialize(root.left)+ "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values=data.split(",");
        Queue<String> queue=new LinkedList<>();

        for(String value:values){
            queue.add(value);
        }
        return buildTree(queue);
    }
    private TreeNode buildTree(Queue<String> queue){
        String value=queue.poll();
        if(value.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(value));

        root.left=buildTree(queue);
        root.right=buildTree(queue);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));