// Last updated: 8/14/2026, 12:04:51 PM
class Solution {
    public boolean isPalindrome(int x) {
       int ans=0;
       int temp=x;
       if(x<0)
        return false;
       while(x!=0){
        int d=x%10;
        ans=ans*10+d;
        x=x/10;
    }
    if(temp==ans)
        return true;
    else 
        return false;
    }
}
    
