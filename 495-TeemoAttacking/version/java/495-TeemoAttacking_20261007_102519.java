// Last updated: 10/7/2026, 10:25:19 AM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int total=0;
4        for(int i=0;i<timeSeries.length-1;i++){
5            int gap=timeSeries[i+1]-timeSeries[i];
6            total+=Math.min(gap,duration);
7        }
8        if(timeSeries.length>0){
9            total+=duration;
10        }
11        return total;
12    }
13}