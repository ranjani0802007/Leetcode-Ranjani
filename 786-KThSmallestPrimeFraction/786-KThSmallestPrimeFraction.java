// Last updated: 10/1/2026, 9:36:37 AM
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