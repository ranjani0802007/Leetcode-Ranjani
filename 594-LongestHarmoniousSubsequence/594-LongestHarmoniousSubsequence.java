// Last updated: 10/1/2026, 9:37:43 AM
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();

        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        int longest=0;
        for(int num:count.keySet()){
            if(count.containsKey(num+1)){
                int length=count.get(num)+count.get(num+1);
                longest =   Math.max(longest,length);
            }
        }
        return longest;
    }
}