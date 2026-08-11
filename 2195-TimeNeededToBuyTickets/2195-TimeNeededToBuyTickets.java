// Last updated: 8/11/2026, 2:15:27 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
            q.add(i);  //storing index

        int t=0;
        while(!q.isEmpty()){
            int ind=q.poll();//comes out of the queue
            t++;            //he need 1sec to buy
            tickets[ind]--;   //decreament needed tickets
            if(tickets[ind]>0)
              q.add(ind);
            if(ind==k && tickets[ind]==0)   //if it is u,
              return t;                    //return the ans
        }
        return t;
    }
}