// Last updated: 10/1/2026, 9:38:53 AM
class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] hex="0123456789abcdef".toCharArray();
        StringBuilder result=new StringBuilder();

        while(num!=0){
            int digit=num & 15;
            result.append(hex[digit]);
            num=num>>>4;
        }
        return result.reverse().toString();
    }
}