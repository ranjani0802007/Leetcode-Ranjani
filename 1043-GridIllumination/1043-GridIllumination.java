// Last updated: 8/11/2026, 2:18:38 PM
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> anti = new HashMap<>();
        Set<Long> set = new HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0], c = lamp[1];
            long key = (long) r * n + c;
            if (set.add(key)) {
                row.put(r, row.getOrDefault(r, 0) + 1);
                col.put(c, col.getOrDefault(c, 0) + 1);
                diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
                anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
            }
        }

        int[] ans = new int[queries.length];
        int[][] dir = {{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];

            if (row.getOrDefault(r,0) > 0 || col.getOrDefault(c,0) > 0 ||
                diag.getOrDefault(r-c,0) > 0 || anti.getOrDefault(r+c,0) > 0)
                ans[i] = 1;

            for (int[] d : dir) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

                long key = (long) nr * n + nc;
                if (set.remove(key)) {
                    row.put(nr, row.get(nr) - 1);
                    col.put(nc, col.get(nc) - 1);
                    diag.put(nr - nc, diag.get(nr - nc) - 1);
                    anti.put(nr + nc, anti.get(nr + nc) - 1);
                }
            }
        }

        return ans;
    }
}