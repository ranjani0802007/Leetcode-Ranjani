// Last updated: 8/22/2026, 10:34:36 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5
6        HashMap<Integer, Integer> losses = new HashMap<>();
7
8        for (int[] match : matches) {
9            int winner = match[0];
10            int loser = match[1];
11
12            losses.putIfAbsent(winner, 0);
13            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
14        }
15
16        List<Integer> zero = new ArrayList<>();
17        List<Integer> one = new ArrayList<>();
18
19        for (int player : losses.keySet()) {
20
21            if (losses.get(player) == 0)
22                zero.add(player);
23            else if (losses.get(player) == 1)
24                one.add(player);
25        }
26
27        Collections.sort(zero);
28        Collections.sort(one);
29
30        return Arrays.asList(zero, one);
31    }
32}