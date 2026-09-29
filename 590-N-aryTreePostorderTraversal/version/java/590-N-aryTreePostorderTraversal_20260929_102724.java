// Last updated: 9/29/2026, 10:27:24 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        List<Integer> result = new ArrayList<>();
23
24        traverse(root,result);
25
26        return result;
27    }
28    private void traverse(Node node,List<Integer> result){
29        if(node==null){
30            return;
31        }
32        for(Node child:node.children){
33            traverse(child,result);
34        }
35        result.add(node.val);
36    }
37}