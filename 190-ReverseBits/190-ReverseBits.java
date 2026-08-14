// Last updated: 8/14/2026, 12:00:31 PM
class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = (rev << 1) | (n & 1);
            n >>= 1;
        }
        return rev;
    }
}