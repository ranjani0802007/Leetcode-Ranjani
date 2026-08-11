// Last updated: 8/11/2026, 2:20:16 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) 
            {

                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return ans;
        }
    }
