// Last updated: 8/11/2026, 2:14:04 PM
class Solution {
    static final long MOD = 1000000007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int sz = 2 * m;

        long[][] T = new long[sz][sz];

        for (int x = 0; x < m; x++) {
            for (int y = x + 1; y < m; y++) {
                T[x][m + y] = 1;
            }
        }

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < x; y++) {
                T[m + x][y] = 1;
            }
        }

        long[][] P = power(T, n - 1);

        long[] init = new long[sz];
        for (int i = 0; i < sz; i++) init[i] = 1;

        long ans = 0;

        for (int i = 0; i < sz; i++) {
            long cur = 0;
            for (int j = 0; j < sz; j++) {
                cur = (cur + P[i][j] * init[j]) % MOD;
            }
            ans = (ans + cur) % MOD;
        }

        return (int) ans;
    }

    private long[][] power(long[][] a, long p) {
        int n = a.length;
        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) res[i][i] = 1;

        while (p > 0) {
            if ((p & 1) == 1) res = multiply(res, a);
            a = multiply(a, a);
            p >>= 1;
        }
        return res;
    }

    private long[][] multiply(long[][] a, long[][] b) {
        int n = a.length;
        long[][] c = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (a[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {
                    if (b[k][j] == 0) continue;

                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }
        return c;
    }
}