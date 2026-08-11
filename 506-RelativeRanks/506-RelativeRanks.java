// Last updated: 8/11/2026, 2:22:07 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];

        int[] temp = score.clone();
        Arrays.sort(temp);

        for(int i=0;i<n;i++){
            int rank = n - Arrays.binarySearch(temp, score[i]);

            if(rank==1) ans[i]="Gold Medal";
            else if(rank==2) ans[i]="Silver Medal";
            else if(rank==3) ans[i]="Bronze Medal";
            else ans[i]=String.valueOf(rank);
        }
        return ans;
    }
}