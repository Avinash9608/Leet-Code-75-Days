package LeetCode75;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true; // Found an increasing triplet
            }
        }

        return false; // No increasing triplet found
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 4, 6};
    }
}
