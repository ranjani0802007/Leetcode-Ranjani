// Last updated: 9/29/2026, 4:03:03 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m=mat.length;
4        int n=mat[0].length;
5
6        if(m*n!=r*c)
7        return mat;
8
9        int[][] result=new int[r][c];
10
11        for(int i=0;i<m*n;i++){
12            result[i/c][i%c]=mat[i/n][i%n];
13        }
14        return result;
15    }
16}