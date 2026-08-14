// Last updated: 8/14/2026, 12:02:27 PM
import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        for (int i = 0; i <= n; i++) {
            // Treat the element after the last item as height 0 to flush the stack
            int currentHeight = (i == n) ? 0 : heights[i];
            
            // Maintain a monotonic increasing stack
            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                // If stack is empty, the bar can extend all the way to index 0
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }
}
