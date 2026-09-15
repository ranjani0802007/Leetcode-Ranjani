// Last updated: 9/15/2026, 4:14:55 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String> result=new ArrayList<>();
4
5        for(int i=0;i<nums.length;i++){
6            int start=nums[i];
7
8            while(i+1<nums.length && nums[i+1]==nums[i]+1){
9                i++;
10            }
11            if(start==nums[i]){
12                result.add(String.valueOf(start));
13            }
14            else{
15                result.add(start+"->"+nums[i]);
16            }
17        }
18        return result;
19    }
20}