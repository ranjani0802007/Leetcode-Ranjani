// Last updated: 8/22/2026, 10:16:52 AM
1import java.util.*;
2
3class RandomizedSet {
4
5    ArrayList<Integer> list = new ArrayList<>();
6    HashMap<Integer, Integer> map = new HashMap<>();
7    Random random = new Random();
8
9    public RandomizedSet() {}
10
11    public boolean insert(int val) {
12        if (map.containsKey(val))
13            return false;
14
15        map.put(val, list.size());
16        list.add(val);
17
18        return true;
19    }
20
21    public boolean remove(int val) {
22        if (!map.containsKey(val))
23            return false;
24
25        int index = map.get(val);
26        int last = list.get(list.size() - 1);
27
28        list.set(index, last);
29        map.put(last, index);
30
31        list.remove(list.size() - 1);
32        map.remove(val);
33
34        return true;
35    }
36
37    public int getRandom() {
38        return list.get(random.nextInt(list.size()));
39    }
40}