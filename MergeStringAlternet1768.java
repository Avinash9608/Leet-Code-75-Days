package LeetCode75;

public class MergeStringAlternet1768 {
    public static void main(String[] args) {
        String word1="cdf";
        String word2="a";
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder sb=new StringBuilder();
        if(len1>=len2)
        {
            for (int i=0;i<len2;i++)
            {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }else
        {
            for (int i=0;i<len1;i++)
            {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        if(len2>len1) {
            for (int i = len1; i < len2; i++) {
                sb.append(word2.charAt(i));
            }
        }
        if (len1>len2)
        {
            for (int i = len2; i < len1; i++) {
                sb.append(word1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
