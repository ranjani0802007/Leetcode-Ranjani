// Last updated: 9/29/2026, 4:11:05 PM
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
17};
18*/
19
20class Solution {
21    public int maxDepth(Node root) {
22        if(root==null)
23        return 0;
24
25        int max=0;
26
27        for(Node child:root.children){
28            max=Math.max(max,maxDepth(child));
29        }
30        return max+1;
31    }
32}