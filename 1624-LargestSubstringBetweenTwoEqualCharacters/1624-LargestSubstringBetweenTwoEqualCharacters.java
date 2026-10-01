// Last updated: 10/1/2026, 9:33:56 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int[] first = new int[26];

        Arrays.fill(first, -1);

        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                max = Math.max(max, i - first[index] - 1);
            }
        }

        return max;
    }
}