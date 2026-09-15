// Last updated: 9/15/2026, 4:28:00 PM
import java.util.*;

class Solution {
    public int countCompleteSubstrings(String word, int k) {

        int n = word.length();
        int answer = 0;

        for (int i = 0; i < n; ) {

            int j = i;

            // Split whenever adjacent characters differ by more than 2
            while (j + 1 < n &&
                   Math.abs(word.charAt(j) - word.charAt(j + 1)) <= 2) {
                j++;
            }

            answer += countSegment(
                    word.substring(i, j + 1), k
            );

            i = j + 1;
        }

        return answer;
    }

    private int countSegment(String s, int k) {

        int n = s.length();
        int answer = 0;

        // Number of distinct characters can be from 1 to 26
        for (int distinct = 1; distinct <= 26; distinct++) {

            int length = distinct * k;

            if (length > n) {
                break;
            }

            int[] freq = new int[26];

            for (int i = 0; i < length; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            if (valid(freq, distinct, k)) {
                answer++;
            }

            for (int right = length; right < n; right++) {

                freq[s.charAt(right) - 'a']++;

                freq[s.charAt(right - length) - 'a']--;

                if (valid(freq, distinct, k)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean valid(int[] freq, int distinct, int k) {

        int count = 0;

        for (int f : freq) {
            if (f > 0) {
                if (f != k) {
                    return false;
                }
                count++;
            }
        }

        return count == distinct;
    }
}