package LeetCode75;
import java.util.Stack;
public class DecodeString {
    public static void main(String[] args) {
        String input="3[a]2[bc]";
        StringBuffer res=new StringBuffer();
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuffer> stringStack=new Stack<>();
        int i=0;
        while (i<input.length())
        {
            if(Character.isDigit(input.charAt(i)))
            {
                int count=0;
                while (Character.isDigit(input.charAt(i)))
                {
                    count=count*10+(input.charAt(i)-'0');
                    i++;
                }
                countStack.push(count);
            }else if(input.charAt(i)=='['){
                stringStack.push(res);
                res=new StringBuffer();
                i++;
            }else if(input.charAt(i)==']')
            {
                StringBuffer tem=res;
                res=stringStack.pop();
                int count=countStack.pop();
                for (int j=0;j<count;j++)
                {
                    res.append(tem);
                }
                i++;
            }else
            {
                res.append(input.charAt(i));
                i++;
            }
        }
        System.out.println(res.toString());
    }
}
