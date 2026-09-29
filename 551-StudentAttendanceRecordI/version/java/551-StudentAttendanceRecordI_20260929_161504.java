// Last updated: 9/29/2026, 4:15:04 PM
1class Solution {
2    public boolean checkRecord(String s) {
3      int absent=0;
4      int late=0;
5
6      for(char ch:s.toCharArray()){
7        if(ch=='A'){
8            absent++;
9            late=0;
10        }
11        else if(ch=='L'){
12            late++;
13        }
14        else{
15            late=0;
16        }
17        if(absent>=2 || late>=3){
18            return false;
19        }
20      } 
21      return true; 
22    }
23}