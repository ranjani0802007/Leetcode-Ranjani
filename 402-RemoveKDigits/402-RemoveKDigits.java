// Last updated: 8/14/2026, 11:57:58 AM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while (k-- > 0) st.pop();

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        while (sb.length() > 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}