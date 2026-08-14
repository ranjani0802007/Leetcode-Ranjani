// Last updated: 8/14/2026, 11:58:33 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1)
        return false;
        while(n%4==0)
            n=n/4;
        if(n==1)
        return true;
        else
        return false;
    }
}
    
