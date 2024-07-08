package LeetCode75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DetermineTwoCloseString {
    private static boolean TryTOAtain(String input1, String input2)
    {
        Set<Character> set2 = new HashSet<>();
        for (char ch : input2.toCharArray()) {
            set2.add(ch);
        }

        // Check if all characters of input1 are present in input2
        for (char ch : input1.toCharArray()) {
            if (!set2.contains(ch)) {
                return false;
            }
        }
        if(input1.length()!=input2.length())
            return false;
        HashMap<Character,Integer> freq=new HashMap<>();
        for (int i=0;i<input1.length();i++)
        {
            char ch=input1.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        System.out.println("Input1 key val "+freq);
        HashMap<Character,Integer> freq1=new HashMap<>();
        for (int i=0;i<input2.length();i++)
        {
            char ch=input2.charAt(i);
            freq1.put(ch, freq1.getOrDefault(ch,0)+1);
        }
        System.out.println("Input2 key val "+freq1);

        HashMap<Integer,Integer> freqOfFreq=new HashMap<>();
       for (int count:freq.values())
       {
           freqOfFreq.put(count,freqOfFreq.getOrDefault(count,0)+1);
       }
        System.out.println("Input1 freq of freq  "+freqOfFreq);
       HashMap<Integer,Integer> freqOfFreq1=new HashMap<>();
       for (int count:freq1.values())
       {
            freqOfFreq1.put(count,freqOfFreq1.getOrDefault(count,0)+1);
       }
        System.out.println("Input2 freq of freq  "+freqOfFreq1);
       return freqOfFreq1.equals(freqOfFreq);
    }
    public static void main(String[] args) {
        String input1="uxu", input2="ssv";
        System.out.println(TryTOAtain(input1,input2));;
    }
}
