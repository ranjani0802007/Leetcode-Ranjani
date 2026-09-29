// Last updated: 9/29/2026, 4:26:04 PM
1class Solution {
2    public int findLUSlength(String a, String b) {
3        if(a.equals(b)){
4            return -1;
5        }
6        return Math.max(a.length(),b.length());
7    }
8}