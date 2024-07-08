package LeetCode75;

public class ContainingMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right= arr.length-1;
        int maxArea=0;
        while (left<right)
        {
            int minHeight=Math.min(arr[left],arr[right]);
            int width=right-left;
            int currArea=width*minHeight;
            maxArea=Math.max(currArea,maxArea);
            if(arr[left]<arr[right])
            {
                left++;
            }else
            {
                right--;
            }
        }
        System.out.println("Max area "+maxArea);
    }
}
