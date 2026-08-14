// Last updated: 8/14/2026, 12:06:46 PM
1class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null)
4            return null;
5
6        HashMap<Node, Node> map = new HashMap<>();
7
8        Node curr = head;
9
10        // Create copied nodes
11        while (curr != null) {
12            map.put(curr, new Node(curr.val));
13            curr = curr.next;
14        }
15
16        // Connect next and random
17        curr = head;
18
19        while (curr != null) {
20            map.get(curr).next = map.get(curr.next);
21            map.get(curr).random = map.get(curr.random);
22            curr = curr.next;
23        }
24
25        return map.get(head);
26    }
27}