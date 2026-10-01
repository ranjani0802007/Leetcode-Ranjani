// Last updated: 10/1/2026, 11:28:08 AM
1class AuthenticationManager {
2
3    HashMap<String,Integer> tokens;
4    int timeToLive;
5
6    public AuthenticationManager(int timeToLive) {
7        tokens=new HashMap<>();
8        this.timeToLive=timeToLive;
9    }
10    
11    public void generate(String tokenId, int currentTime) {
12        tokens.put(tokenId,currentTime+timeToLive);
13    }
14    
15    public void renew(String tokenId, int currentTime) {
16        if(tokens.containsKey(tokenId)){
17            int expiryTime=tokens.get(tokenId);
18
19            if(expiryTime>currentTime){
20                tokens.put(tokenId,currentTime+timeToLive);
21            }
22        }
23    }
24    
25    public int countUnexpiredTokens(int currentTime) {
26        int count=0;
27
28        for(int expiryTime:tokens.values()){
29            if(expiryTime>currentTime){
30                count++;
31            }
32        }
33        return count;
34    }
35}
36
37/**
38 * Your AuthenticationManager object will be instantiated and called as such:
39 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
40 * obj.generate(tokenId,currentTime);
41 * obj.renew(tokenId,currentTime);
42 * int param_3 = obj.countUnexpiredTokens(currentTime);
43 */