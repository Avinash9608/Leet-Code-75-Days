package LeetCode75;

public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr={65,63,39,57,9,29};
        int N = 6, X = 2;
        int Floor=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;
        for (int i=0;i<N;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]>Floor && X>=arr[i])
                Floor=arr[i];
            if(arr[i] >= X && arr[i] < ceil)
                ceil=arr[i];
        }
        System.out.println("Floor "+Floor);
        System.out.println("Max "+max);
        System.out.println("Ceil "+ceil);

    }
}
