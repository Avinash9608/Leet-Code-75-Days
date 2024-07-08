package LeetCode75;

public class ProductOfNumExceptItSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] leftProduct=new int[nums.length];
        int[] rightProduct=new int[nums.length];
        int[] result=new int[nums.length];
        int leftprd=1;
        int rightprd=1;
        for(int i=0;i<nums.length;i++)
        {
            leftProduct[i]=leftprd;
            leftprd*=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            rightProduct[i]=rightprd;
            rightprd*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            result[i]=leftProduct[i]*rightProduct[i];
        }
        for(int x: result)
            System.out.print(x+" ");

    }
}
