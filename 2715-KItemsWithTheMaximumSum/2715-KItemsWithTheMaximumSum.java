// Last updated: 8/11/2026, 2:14:56 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int onesPicked = Math.min(numOnes, k);
        
        int remaining = k - onesPicked;
        
        int negPicked = Math.max(0, remaining - numZeros);
        
        return onesPicked - negPicked;
    }
}