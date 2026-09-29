// Last updated: 9/29/2026, 9:02:30 PM
1class Solution {
2    public int arrangeCoins(int n) {
3        int rows=0;
4        while(n>=rows+1){
5            rows++;
6            n=n-rows;
7        }
8        return rows;
9    }
10}