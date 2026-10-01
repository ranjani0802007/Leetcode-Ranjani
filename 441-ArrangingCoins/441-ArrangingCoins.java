// Last updated: 10/1/2026, 9:38:44 AM
class Solution {
    public int arrangeCoins(int n) {
        int rows=0;
        while(n>=rows+1){
            rows++;
            n=n-rows;
        }
        return rows;
    }
}