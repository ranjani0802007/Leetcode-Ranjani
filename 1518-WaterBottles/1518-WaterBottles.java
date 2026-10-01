// Last updated: 10/1/2026, 9:34:15 AM
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