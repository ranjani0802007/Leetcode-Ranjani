// Last updated: 8/14/2026, 11:59:30 AM
class Solution {
public:
    bool isPowerOfTwo(int n) {
    /*if(n<1)
    return false;
    while(n%2==0)
          n=n/2;
    if(n==1)
    return true;
    else
    return false;*/ 
    return n>0 &&(n&(n-1))==0;
    }
};