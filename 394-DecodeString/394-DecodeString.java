// Last updated: 8/14/2026, 11:58:01 AM
class Solution {
    public String decodeString(String str) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> st = new Stack<>();
        int n = 0;
        String s = "";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch))
               n = n*10 + ch-'0';
            else if(Character.isAlphabetic(ch))
               s = s+ch;  
            else if(ch=='['){
                numSt.push(n);
                st.push(s);
                n = 0;
                s="";
            }    
            else{
                StringBuilder temp = new StringBuilder();
                int t = numSt.pop();
                for(int i=0;i<t;i++){
                    temp.append(s);
                }
                s = st.pop()+temp.toString();
            }
        }
        return s;
    }
}
