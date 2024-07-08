package LeetCode75;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInString {
    private static String revWord(String input)
    {
        String[] strArray=input.split("\\s+");
        for(int i=0;i<strArray.length/2;i++)
        {
            String temp=strArray[i];
            strArray[i]=strArray[strArray.length-i-1];
            strArray[strArray.length-i-1]=temp;
        }
        String reversedString = String.join(" ", strArray);
        return reversedString;
    }

    private static String revWordSecWay(String input)
    {
        String []words=input.split("\\s+");
        List<String> res=new ArrayList<>();
        for (String word:words)
        {
            if(!word.isEmpty())
                res.add(word);
        }
        Collections.reverse(res);
        return String.join(" ",res);
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input ");
        String input=kb.nextLine();
        String result=revWordSecWay(input);
        System.out.println(result);
    }
}
