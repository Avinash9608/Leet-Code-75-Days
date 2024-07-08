package LeetCode75;

public class ExtractMaximum {
    public static void main(String[] args) {
        String str="abcd";
        StringBuilder sb=new StringBuilder();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
                sb.append(ch);
            else if(sb.length()>0)
            {
                int no=Integer.parseInt(sb.toString());
                max=Math.max(no,max);
                sb.setLength(0);
            }
        }
        if(sb.length()>0)
        {

            int no=Integer.parseInt(sb.toString());
            max=Math.max(no,max);
            sb.setLength(0);
        }
        if(sb.length()==0)
            System.out.println("-1");
        else
        System.out.println(max);
    }
}
