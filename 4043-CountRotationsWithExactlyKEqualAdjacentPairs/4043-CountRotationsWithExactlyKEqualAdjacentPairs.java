// Last updated: 9/15/2026, 4:27:12 PM
class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int totalcyclicmatches=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                totalcyclicmatches++;
            }
        }
        int validrotationscount=0;
        for(int j=0;j<n;j++){
            int previdx=(j-1+n)%n;
            int currentscore=totalcyclicmatches;
            if(s.charAt(previdx)==s.charAt(j)){
                currentscore--;
            }
            if(currentscore==k){
                validrotationscount++;
            }
        }
        return validrotationscount;
    }
}