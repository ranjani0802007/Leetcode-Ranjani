// Last updated: 9/15/2026, 4:27:41 PM
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int pushes=0;
        for(int i=0;i<n;i++){
            pushes+=(i/8)+1;
        }
        return pushes;
    }
}