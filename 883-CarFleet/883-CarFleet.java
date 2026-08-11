// Last updated: 8/11/2026, 2:19:28 PM
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i] = new int[]{position[i], speed[i]};
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);
        int fleets = 0;
        double time = 0;
        for (int i = n - 1; i >= 0; i--) {
            double t = (double)(target - cars[i][0]) / cars[i][1];
            if (t > time) {
                fleets++;
                time = t;
            }
        }
        return fleets;
    }
}