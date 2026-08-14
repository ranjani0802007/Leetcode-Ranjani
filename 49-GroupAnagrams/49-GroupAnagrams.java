// Last updated: 8/14/2026, 12:03:39 PM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);

            String sorted = new String(temp);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(s);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for (List<String> l : map.values()) {
            res.add(l);
        }

        return res;
    }
}
