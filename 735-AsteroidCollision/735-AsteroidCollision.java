// Last updated: 8/11/2026, 2:20:19 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() &&
                   asteroid < 0 &&
                   stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop(); // stack asteroid explodes
                } else if (stack.peek() == -asteroid) {
                    stack.pop(); // both explode
                    destroyed = true;
                    break;
                } else {
                    // current asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}