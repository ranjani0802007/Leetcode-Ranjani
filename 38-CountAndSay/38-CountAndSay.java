// Last updated: 10/1/2026, 9:42:06 AM
class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int k = 1; k < n; k++) {
            StringBuilder sb = new StringBuilder();

            int i = 0;

            while (i < s.length()) {
                int j = i;

                while (j < s.length() && s.charAt(j) == s.charAt(i))
                    j++;

                sb.append(j - i);
                sb.append(s.charAt(i));

                i = j;
            }

            s = sb.toString();
        }

        return s;
    }
}