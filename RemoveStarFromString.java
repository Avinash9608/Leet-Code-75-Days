package LeetCode75;

public class RemoveStarFromString {
    public static void main(String[] args) {
        String input="leet**cod*e";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch!='*')
                sb.append(ch);
            else
            {
                if(sb.length()!=0)
                {
                    sb.setLength(sb.length() - 1);
                }
            }
        }
        System.out.println(sb);
    }
}
