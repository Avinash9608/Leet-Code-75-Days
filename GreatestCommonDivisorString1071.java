package LeetCode75;

public class GreatestCommonDivisorString1071 {
    public static void main(String[] args) {
        String str1="TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2="TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
//        String str1="ABCABC";
//        String str2="ABC";
        System.out.println(str1.length());
        System.out.println(str2.length());
        StringBuilder temp=new StringBuilder();
        for(int i=0;i< Math.min(str1.length(), str2.length());i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if(ch1==ch2)
            {
                temp.append(ch1);
            }else
            {
                break;
            }
        }
        System.out.println(temp);
        StringBuilder sb=new StringBuilder();
        if(temp.length()==0)
        {
            System.out.println("Empty ");
            System.exit(0);
        }
        sb.append(temp.charAt(0));
        for(int i=1;i<temp.length();i++)
        {
            char ch=temp.charAt(0);
            char ch1=temp.charAt(i);

            if(ch!=ch1)
            {
                sb.append(ch1);
            }else
            {
                break;
            }
        }
        System.out.println(sb.toString());
        StringBuilder result=new StringBuilder();
        if(sb.length()==0)
        {
            sb.append("");
            System.out.println(sb.toString());
            System.exit(0);
        }
        int times=Math.max(str1.length(),str2.length())/sb.length();
        System.out.println(times);
        for(int i=0;i<times;i++)
        {
            result.append(sb);
//            System.out.println(result);
        }
//        System.out.println("hello" +result.toString().equals(str1));
        if(result.toString().equals(str1))
        {

            System.out.println(sb.toString());
        }else
        {
            sb.setLength(0);
            sb.append("");
            System.out.println(sb);
            System.out.println("Empty");
        }
//        System.out.println(result);
//        if ((sb.length()==0))
//            sb.append(" ");
//        System.out.println(sb.toString());
    }
}
