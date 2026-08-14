// Last updated: 8/14/2026, 12:12:23 PM
1class LRUCache {
2
3    class Node {
4        int key, value;
5        Node prev, next;
6
7        Node(int key, int value) {
8            this.key = key;
9            this.value = value;
10        }
11    }
12
13    HashMap<Integer, Node> map = new HashMap<>();
14    Node head = new Node(0, 0);
15    Node tail = new Node(0, 0);
16    int capacity;
17
18    public LRUCache(int capacity) {
19        this.capacity = capacity;
20
21        head.next = tail;
22        tail.prev = head;
23    }
24
25    public int get(int key) {
26        if (!map.containsKey(key))
27            return -1;
28
29        Node node = map.get(key);
30        remove(node);
31        insert(node);
32
33        return node.value;
34    }
35
36    public void put(int key, int value) {
37        if (map.containsKey(key))
38            remove(map.get(key));
39
40        Node node = new Node(key, value);
41        map.put(key, node);
42        insert(node);
43
44        if (map.size() > capacity) {
45            Node lru = head.next;
46            remove(lru);
47            map.remove(lru.key);
48        }
49    }
50
51    void remove(Node node) {
52        node.prev.next = node.next;
53        node.next.prev = node.prev;
54    }
55
56    void insert(Node node) {
57        node.prev = tail.prev;
58        node.next = tail;
59
60        tail.prev.next = node;
61        tail.prev = node;
62    }
63}