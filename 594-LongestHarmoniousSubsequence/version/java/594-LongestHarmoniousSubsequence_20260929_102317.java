// Last updated: 9/29/2026, 10:23:17 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Map<Integer,Integer> count=new HashMap<>();
4
5        for(int num:nums){
6            count.put(num,count.getOrDefault(num,0)+1);
7        }
8        int longest=0;
9        for(int num:count.keySet()){
10            if(count.containsKey(num+1)){
11                int length=count.get(num)+count.get(num+1);
12                longest =   Math.max(longest,length);
13            }
14        }
15        return longest;
16    }
17}