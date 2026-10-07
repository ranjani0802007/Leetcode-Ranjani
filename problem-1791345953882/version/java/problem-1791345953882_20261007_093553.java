// Last updated: 10/7/2026, 9:35:53 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3       int m=word1.length();
4       int n=word2.length();
5
6       int[][] dp=new int[m+1][n+1];
7
8       for(int i=0;i<=m;i++){
9        dp[i][0]=i;
10       }
11       for(int j=0;j<=n;j++){
12        dp[0][j]=j;
13       }
14       for(int i=1;i<=m;i++){
15        for(int j=1;j<=n;j++){
16            if(word1.charAt(i-1)==word2.charAt(j-1)){
17                dp[i][j]=dp[i-1][j-1];
18            }
19            else{
20                dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
21                }
22            }
23        } 
24        return dp[m][n];
25    }
26}