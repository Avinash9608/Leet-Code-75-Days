package LeetCode75;
import java.util.Scanner;
public class NextYear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter year ");
        int year=kb.nextInt();
        int count=0;
        int n=10;
        while (count!=n)
        {
            year=year+1;
            if((year%4==0 && year!=100)||(year%400==0))
            {
                System.out.println("leap year "+year);
                count++;
            }else
            {
                System.out.println("Not leap year ");
            }
        }
    }
}
