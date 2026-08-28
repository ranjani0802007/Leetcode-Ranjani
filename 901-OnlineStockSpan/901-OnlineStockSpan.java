// Last updated: 8/28/2026, 9:36:25 AM
1import java.util.*;
2
3class Solution {
4    public int countCompleteSubstrings(String word, int k) {
5
6        int n = word.length();
7        int answer = 0;
8
9        for (int i = 0; i < n; ) {
10
11            int j = i;
12
13            // Split whenever adjacent characters differ by more than 2
14            while (j + 1 < n &&
15                   Math.abs(word.charAt(j) - word.charAt(j + 1)) <= 2) {
16                j++;
17            }
18
19            answer += countSegment(
20                    word.substring(i, j + 1), k
21            );
22
23            i = j + 1;
24        }
25
26        return answer;
27    }
28
29    private int countSegment(String s, int k) {
30
31        int n = s.length();
32        int answer = 0;
33
34        // Number of distinct characters can be from 1 to 26
35        for (int distinct = 1; distinct <= 26; distinct++) {
36
37            int length = distinct * k;
38
39            if (length > n) {
40                break;
41            }
42
43            int[] freq = new int[26];
44
45            for (int i = 0; i < length; i++) {
46                freq[s.charAt(i) - 'a']++;
47            }
48
49            if (valid(freq, distinct, k)) {
50                answer++;
51            }
52
53            for (int right = length; right < n; right++) {
54
55                freq[s.charAt(right) - 'a']++;
56
57                freq[s.charAt(right - length) - 'a']--;
58
59                if (valid(freq, distinct, k)) {
60                    answer++;
61                }
62            }
63        }
64
65        return answer;
66    }
67
68    private boolean valid(int[] freq, int distinct, int k) {
69
70        int count = 0;
71
72        for (int f : freq) {
73            if (f > 0) {
74                if (f != k) {
75                    return false;
76                }
77                count++;
78            }
79        }
80
81        return count == distinct;
82    }
83}