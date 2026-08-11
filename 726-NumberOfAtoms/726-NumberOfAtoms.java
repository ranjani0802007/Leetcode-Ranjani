// Last updated: 8/11/2026, 2:20:27 PM
import java.util.*;

class Solution {
    int i = 0;

    public String countOfAtoms(String formula) {
        Map<String, Integer> map = parse(formula);

        StringBuilder sb = new StringBuilder();

        for (String atom : map.keySet()) {
            sb.append(atom);
            if (map.get(atom) > 1)
                sb.append(map.get(atom));
        }

        return sb.toString();
    }

    private Map<String, Integer> parse(String s) {
        Map<String, Integer> map = new TreeMap<>();

        while (i < s.length() && s.charAt(i) != ')') {
            if (s.charAt(i) == '(') {
                i++;
                Map<String, Integer> temp = parse(s);
                i++;

                int count = getNumber(s);

                for (String key : temp.keySet())
                    map.put(key, map.getOrDefault(key, 0) + temp.get(key) * count);

            } else {
                String atom = getAtom(s);
                int count = getNumber(s);
                map.put(atom, map.getOrDefault(atom, 0) + count);
            }
        }

        return map;
    }

    private String getAtom(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(i++));

        while (i < s.length() && Character.isLowerCase(s.charAt(i)))
            sb.append(s.charAt(i++));

        return sb.toString();
    }

    private int getNumber(String s) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i)))
            return 1;

        int num = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i)))
            num = num * 10 + (s.charAt(i++) - '0');

        return num;
    }
}