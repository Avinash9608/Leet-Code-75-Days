package LeetCode75;

public class MaxProdOfTwoNo {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 6, 7, 0};
        int left=0;
        int right= arr.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            int currMult=arr[left]*arr[right];
            max=Math.max(currMult,max);
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        System.out.println(max);
    }
}
