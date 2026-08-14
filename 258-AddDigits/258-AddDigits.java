// Last updated: 8/14/2026, 11:59:13 AM
class Solution {
    public int addDigits(int num) {
       int sum=0;
    while(num>9){
        sum=0;
    while(num!=0){
        int d=num%10;
        sum+=d;
        num=num/10;
    }
    num=sum;
    }
    return num; 
    
}
}