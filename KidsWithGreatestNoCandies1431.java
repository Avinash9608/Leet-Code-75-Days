package LeetCode75;

public class KidsWithGreatestNoCandies1431 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        boolean[] result=new boolean[candies.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {
            int currCandies=candies[i]+extraCandies;
            if(currCandies>=max)
                result[i]=true;
            else
                result[i]=false;
        }
        for(boolean x:result)
            System.out.print(x+" ");
    }
}
