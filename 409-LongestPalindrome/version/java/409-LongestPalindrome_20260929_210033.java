// Last updated: 9/29/2026, 9:00:33 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count=new int[128];
4
5        for(char c:s.toCharArray()){
6            count[c]++;
7        }
8        int length=0;
9        boolean odd=false;
10
11        for(int n:count){
12            length+=(n/2)*2;
13            if(n%2==1){
14                odd=true;
15            }
16        }
17        if(odd){
18            length++;
19        }
20        return length;
21    }
22}