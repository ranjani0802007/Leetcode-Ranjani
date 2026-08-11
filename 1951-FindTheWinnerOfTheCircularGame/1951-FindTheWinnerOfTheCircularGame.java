// Last updated: 8/11/2026, 2:15:51 PM
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++)
           q.add(i);                  //{1,2,3,4,5}
        while(q.size()!=1){
            for(int i=0;i<k-1;i++)        //k=3
               q.add(q.poll());          //saved all previous numbers
            q.poll();               //delete 3rd person
        }
        
        return q.peek();
    }
}