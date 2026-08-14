// Last updated: 8/14/2026, 11:58:30 AM
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int st=0,ed=n-1,i;
        char temp=0;
        while(st<=ed){
            temp=s[st];
            s[st]=s[ed];
            s[ed]=temp;
            st++;
            ed--;
        }
    }
}