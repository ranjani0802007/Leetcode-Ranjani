// Last updated: 10/7/2026, 9:17:54 AM
1import java.util.*;
2
3class AllOne {
4
5    class Node {
6        int count;
7        HashSet<String> keys = new HashSet<>();
8        Node prev, next;
9
10        Node(int count) {
11            this.count = count;
12        }
13    }
14
15    HashMap<String, Node> map;
16    Node head, tail;
17
18    public AllOne() {
19        map = new HashMap<>();
20
21        head = new Node(0);
22        tail = new Node(0);
23
24        head.next = tail;
25        tail.prev = head;
26    }
27
28    public void inc(String key) {
29
30        if (!map.containsKey(key)) {
31
32            Node first = head.next;
33
34            if (first == tail || first.count != 1) {
35                Node newNode = new Node(1);
36                addAfter(head, newNode);
37                first = newNode;
38            }
39
40            first.keys.add(key);
41            map.put(key, first);
42
43        } else {
44
45            Node current = map.get(key);
46            Node next = current.next;
47
48            if (next == tail || next.count != current.count + 1) {
49                Node newNode = new Node(current.count + 1);
50                addAfter(current, newNode);
51                next = newNode;
52            }
53
54            next.keys.add(key);
55            map.put(key, next);
56
57            current.keys.remove(key);
58
59            if (current.keys.isEmpty()) {
60                remove(current);
61            }
62        }
63    }
64
65    public void dec(String key) {
66
67        Node current = map.get(key);
68
69        if (current.count == 1) {
70
71            map.remove(key);
72
73        } else {
74
75            Node prev = current.prev;
76
77            if (prev == head || prev.count != current.count - 1) {
78                Node newNode = new Node(current.count - 1);
79                addAfter(prev, newNode);
80                prev = newNode;
81            }
82
83            prev.keys.add(key);
84            map.put(key, prev);
85        }
86
87        current.keys.remove(key);
88
89        if (current.keys.isEmpty()) {
90            remove(current);
91        }
92    }
93
94    public String getMaxKey() {
95
96        if (tail.prev == head) {
97            return "";
98        }
99
100        return tail.prev.keys.iterator().next();
101    }
102
103    public String getMinKey() {
104
105        if (head.next == tail) {
106            return "";
107        }
108
109        return head.next.keys.iterator().next();
110    }
111
112    private void addAfter(Node prev, Node node) {
113
114        node.next = prev.next;
115        node.prev = prev;
116
117        prev.next.prev = node;
118        prev.next = node;
119    }
120
121    private void remove(Node node) {
122
123        node.prev.next = node.next;
124        node.next.prev = node.prev;
125    }
126}