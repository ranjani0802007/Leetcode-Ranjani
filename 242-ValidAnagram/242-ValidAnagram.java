// Last updated: 8/14/2026, 11:59:18 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        /*char[] a=s.toCharArray();
        Arrays.sort(a);
        char[] b=t.toCharArray();
        Arrays.sort(b);
        return Arrays.equals(a,b);*/

        int[] freqA=new int[26];
         int[] freqB=new int[26];
       for( char c : s.toCharArray())
        freqA[c-97]++;
        for( char c : t.toCharArray())
        freqB[c-97]++;
        return Arrays.equals(freqA,freqB);
    }
}