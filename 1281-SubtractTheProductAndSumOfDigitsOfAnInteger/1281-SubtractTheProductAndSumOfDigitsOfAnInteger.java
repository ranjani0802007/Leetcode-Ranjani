// Last updated: 10/1/2026, 9:35:00 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,p=1,s=0;
        while(n!=0){
            d=n%10;
            p*=d;
            s+=d;
            n/=10;
        }
        return p-s;
    }
}