// Last updated: 10/1/2026, 9:37:02 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }

        return Math.min(first, second);
    }
}