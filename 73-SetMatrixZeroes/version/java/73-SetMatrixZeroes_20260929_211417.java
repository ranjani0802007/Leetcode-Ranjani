// Last updated: 9/29/2026, 9:14:17 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows=matrix.length;
4        int cols=matrix[0].length;
5
6        boolean[] row=new boolean[rows];
7        boolean[] col=new boolean[cols];
8
9        for(int i=0;i<rows;i++){
10            for(int j=0;j<cols;j++){
11                if(matrix[i][j]==0){
12                    row[i]=true;
13                    col[j]=true;
14                }
15            }
16        }
17        for(int i=0;i<rows;i++){
18            if(row[i]){
19                for(int j=0;j<cols;j++){
20                    matrix[i][j]=0;
21                }
22            }
23        }
24        for(int j=0;j<cols;j++){
25            if(col[j]){
26                for(int i=0;i<rows;i++){
27                    matrix[i][j]=0;
28                }
29            }
30        }
31    }
32}