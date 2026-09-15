// Last updated: 9/15/2026, 4:28:41 PM
class Solution {
    public int passThePillow(int n, int time) {
       int cycle=time/(n-1);
       int r=time%(n-1);
       return(cycle%2==0)?(1+r):(n-r); 
    }
}