// Last updated: 9/15/2026, 4:28:30 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int onesPicked = Math.min(numOnes, k);
        
        int remaining = k - onesPicked;
        
        int negPicked = Math.max(0, remaining - numZeros);
        
        return onesPicked - negPicked;
    }
}