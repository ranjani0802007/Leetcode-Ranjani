// Last updated: 8/11/2026, 2:15:03 PM
class Solution {
    public int passThePillow(int n, int time) {
       int cycle=time/(n-1);
       int r=time%(n-1);
       return(cycle%2==0)?(1+r):(n-r); 
    }
}