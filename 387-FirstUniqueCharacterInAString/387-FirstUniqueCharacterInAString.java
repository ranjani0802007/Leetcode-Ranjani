// Last updated: 8/14/2026, 11:58:10 AM
class Solution {
    public int firstUniqChar(String s) {
       int n = s.length();
       int freq[] = new int[256];
       char ch[] = s.toCharArray();
       for(char i:ch){
        freq[i]++;
       }
       for(int i=0;i<n;i++){
         if(freq[s.charAt(i)]==1)
            return i;
       }
       return -1;
    }
}