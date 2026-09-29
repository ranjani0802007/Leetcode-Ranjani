// Last updated: 9/29/2026, 9:20:09 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result=new ArrayList<>();
4        backtrack(nums,0,new ArrayList<>(),result);
5        return result;
6    }
7    void backtrack(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
8        result.add(new ArrayList<>(current));
9        for(int i=index;i<nums.length;i++){
10            current.add(nums[i]);
11            backtrack(nums,i+1,current,result);
12            current.remove(current.size()-1);
13        }
14    }
15}