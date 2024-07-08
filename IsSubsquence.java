package LeetCode75;

public class IsSubsquence {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        int index=-1;
        for(char c:t.toCharArray())
        {
            index=s.indexOf(c,index+1);
            if(index==-1)
            {
                System.out.println("result not found ");
                break;
            }
        }
        System.out.println("result found");
    }
}
