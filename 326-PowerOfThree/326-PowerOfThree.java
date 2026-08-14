// Last updated: 8/14/2026, 11:58:41 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        return false;
        while(n%3==0)
            n=n/3;
        if(n==1)
        return true;
        else
        return false;
    }
}