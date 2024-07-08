package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class AnagramPalindrom {
    public static void main(String[] args) {
        String str="hh";
        Map<Character, Integer> freq=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry: freq.entrySet())
        {
//            System.out.println(entry.getValue());
            if(entry.getValue()%2!=0)
            {
                count++;
            }
//            System.out.println("count "+count);
        }
        System.out.println(  count <= 1 ? 1 : 0);
    }
}
