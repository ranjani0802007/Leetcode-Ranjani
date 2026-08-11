// Last updated: 8/11/2026, 2:15:57 PM
class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        int n = cars.length;
        double[] ans = new double[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int pos = cars[i][0], speed = cars[i][1];
            while (!st.isEmpty()) {
                int j = st.peek();
                if (speed <= cars[j][1]) {
                    st.pop();
                } else {
                    double t = (double)(cars[j][0] - pos) / (speed - cars[j][1]);
                    if (ans[j] == -1 || t <= ans[j])
                        break;
                    st.pop();
                }
            }
            if (!st.isEmpty()) {
                int j = st.peek();
                ans[i] = (double)(cars[j][0] - pos) / (speed - cars[j][1]);
            }
            st.push(i);
        }
        return ans;
    }
}