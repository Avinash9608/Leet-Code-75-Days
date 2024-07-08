package LeetCode75;
import java.util.Stack;
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // Destroy smaller asteroids
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids are destroyed
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // Negative asteroid survives
                }
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        // Print result
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}
