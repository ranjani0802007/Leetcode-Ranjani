// Last updated: 8/22/2026, 11:19:21 AM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
7
8        ArrayList<int[]> list = new ArrayList<>();
9
10        for (int[] interval : intervals) {
11
12            if (list.isEmpty() ||
13                list.get(list.size() - 1)[1] < interval[0]) {
14
15                list.add(interval);
16
17            } else {
18
19                list.get(list.size() - 1)[1] =
20                    Math.max(list.get(list.size() - 1)[1],
21                             interval[1]);
22            }
23        }
24
25        return list.toArray(new int[list.size()][]);
26    }
27}