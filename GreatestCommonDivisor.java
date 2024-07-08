package LeetCode75;
import java.util.Scanner;
public class GreatestCommonDivisor {
    private static String findGreater(String str1, String str2)
    {
        if(str1.equals(str2))
            return str1;
        if(str1.length()<str2.length())
        {
            if(str2.startsWith(str1))
            {
                return findGreater(str1,str2.substring(str1.length()));
            }
        }else
        {
            if(str1.startsWith(str2))
            {
                return findGreater(str1.substring(str2.length()),str2);
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter str1");
        String input=kb.next();
        System.out.println("Enter str2");
        String input2=kb.next();
        String result=findGreater(input,input2);
        System.out.println(result);
    }
}
