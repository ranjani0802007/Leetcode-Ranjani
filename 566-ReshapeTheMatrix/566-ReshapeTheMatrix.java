// Last updated: 10/1/2026, 9:37:57 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;

        if(m*n!=r*c)
        return mat;

        int[][] result=new int[r][c];

        for(int i=0;i<m*n;i++){
            result[i/c][i%c]=mat[i/n][i%n];
        }
        return result;
    }
}