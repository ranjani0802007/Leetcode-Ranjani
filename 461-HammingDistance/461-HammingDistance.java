// Last updated: 8/11/2026, 2:22:23 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}