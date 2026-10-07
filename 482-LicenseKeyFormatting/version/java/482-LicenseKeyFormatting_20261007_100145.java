// Last updated: 10/7/2026, 10:01:45 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.replace("-","").toUpperCase();
4
5        StringBuilder result=new StringBuilder();
6
7        int count=0;
8
9        for(int i=s.length()-1;i>=0;i--){
10            if(count==k){
11                result.append('-');
12                count=0;
13            }
14            result.append(s.charAt(i));
15            count++;
16        }
17        return result.reverse().toString();
18    }
19}