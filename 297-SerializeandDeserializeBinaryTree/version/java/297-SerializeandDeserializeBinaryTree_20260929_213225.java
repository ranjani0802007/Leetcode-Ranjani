// Last updated: 9/29/2026, 9:32:25 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if(root==null){
15            return "null";
16        }
17        return root.val + "," +
18           serialize(root.left)+ "," + serialize(root.right);
19    }
20
21    // Decodes your encoded data to tree.
22    public TreeNode deserialize(String data) {
23        String[] values=data.split(",");
24        Queue<String> queue=new LinkedList<>();
25
26        for(String value:values){
27            queue.add(value);
28        }
29        return buildTree(queue);
30    }
31    private TreeNode buildTree(Queue<String> queue){
32        String value=queue.poll();
33        if(value.equals("null")){
34            return null;
35        }
36        TreeNode root=new TreeNode(Integer.parseInt(value));
37
38        root.left=buildTree(queue);
39        root.right=buildTree(queue);
40
41        return root;
42    }
43}
44
45// Your Codec object will be instantiated and called as such:
46// Codec ser = new Codec();
47// Codec deser = new Codec();
48// TreeNode ans = deser.deserialize(ser.serialize(root));