// Last updated: 9/29/2026, 4:29:19 PM
1class Solution {
2    public String convertToBase7(int num) {
3        if(num==0){
4            return "0";
5        }
6        boolean negative=num<0;
7        num=Math.abs(num);
8
9        StringBuilder result=new StringBuilder();
10
11        while(num>0){
12            result.append(num%7);
13            num=num/7;
14        }
15        if(negative){
16            result.append("-");
17        }
18        return result.reverse().toString();
19    }
20}