// Last updated: 8/11/2026, 2:18:00 PM
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int cost = 0;

        while (arr.length > 1) {
            int minIdx = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
            }

            if (minIdx == 0)
                cost += arr[minIdx] * arr[minIdx + 1];
            else if (minIdx == arr.length - 1)
                cost += arr[minIdx] * arr[minIdx - 1];
            else
                cost += arr[minIdx] * Math.min(arr[minIdx - 1], arr[minIdx + 1]);

            int[] temp = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == minIdx) continue;
                temp[j++] = arr[i];
            }
            arr = temp;
        }

        return cost;
    }
}