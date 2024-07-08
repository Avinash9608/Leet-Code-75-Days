package LeetCode75;

public class MaxConsuctiveSum111 {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=3;
        int temp=k;
        int left=0, right=0;
        int max=Integer.MIN_VALUE;
        while(right < arr.length) {
            if(arr[right] == 0) {
                temp--;
            }
            if(temp < 0) {
                if(arr[left] == 0) {
                    temp++;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        System.out.println("max "+max); // Output: max 6
    }
}
