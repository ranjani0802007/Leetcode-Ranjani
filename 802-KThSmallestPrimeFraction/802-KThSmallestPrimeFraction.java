// Last updated: 8/11/2026, 2:19:50 PM
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<double[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(new double[]{(double) arr[i] / arr[j], arr[i], arr[j]});
            }
        }

        list.sort((a, b) -> Double.compare(a[0], b[0]));

        double[] res = list.get(k - 1);
        return new int[]{(int) res[1], (int) res[2]};
    }
}