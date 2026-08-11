// Last updated: 8/11/2026, 2:16:38 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int drank=0;
        while(numBottles>0){
            numBottles--;
            drank++;
            empty++;
         if(empty==numExchange){
            numBottles++;
            empty=0;
         }   
        }
        return drank;
        
    }
}