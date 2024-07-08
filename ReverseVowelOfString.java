package LeetCode75;

import java.util.Scanner;

public class ReverseVowelOfString {
    private static String ReverseVowel(String input)
    {
        char[] chaRarr=input.toCharArray();
        int start=0;
        int end=input.length()-1;
        String vowel="aeiouAEIOU";
        while (start<end)
        {
            while (start<end && vowel.indexOf(chaRarr[start])==-1) {
                start++;
            }
            while (start<end && vowel.indexOf(chaRarr[end])==-1){
                end--;
            }
            while (start<end)
            {
                char temp=chaRarr[start];
                chaRarr[start]=chaRarr[end];
                chaRarr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(chaRarr);
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter input as string ");
        String input=kb.next();
        String result=ReverseVowel(input);
        System.out.println(result);
    }
}
