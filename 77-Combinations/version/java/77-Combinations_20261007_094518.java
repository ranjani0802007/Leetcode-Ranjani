// Last updated: 10/7/2026, 9:45:18 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3      List<List<Integer>> result=new ArrayList<>();
4      backtrack(1,n,k,new ArrayList<>(),result);
5      return result;  
6    }
7    void backtrack(int start,int n,int k,List<Integer> current,List<List<Integer>> result){
8        if(current.size()==k){
9            result.add(new ArrayList<>(current));
10            return;
11        }
12        for(int i=start;i<=n;i++){
13            current.add(i);
14
15            backtrack(i+1,n,k,current,result);
16
17            current.remove(current.size()-1);
18        }
19    }
20}