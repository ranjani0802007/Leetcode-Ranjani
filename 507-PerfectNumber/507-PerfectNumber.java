// Last updated: 8/11/2026, 2:22:04 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
            sum+=i;
        }
        if(num==sum)
        return true;
        else
        return false;

    }
}