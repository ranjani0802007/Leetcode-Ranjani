// Last updated: 8/11/2026, 2:15:24 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        /*int temp=num;
        int ans=0,rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        while(rev!=0){
            int d=rev%10;
            ans=ans*10+d;
            rev=rev/10;

        }
        if(temp==ans)
        return true;
        else
        return false;*/
        return(num==0||num%10!=0);
        
    }
}