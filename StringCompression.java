package LeetCode75;

public class StringCompression {
    public static void main(String[] args) {
//        char[] chars = {'a','b','b','b','c','c','c'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int temp=0;
        if(chars.length==1) {
            System.out.println(1);
            System.exit(0);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< chars.length-1;i++)
        {
            if(chars[i]!=chars[i+1])
            {
                sb.append(chars[i]);
                if(temp>1)
                {
                    sb.append(chars[i]);
                    sb.append(temp+1);
                    temp=0;
                }
            }else
            {
                temp++;
            }
        }
        sb.append(chars[chars.length-1]);
        sb.append(temp+1);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}

