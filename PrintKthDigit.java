package LeetCode75;

public class PrintKthDigit {
    public static void main(String[] args) {
        int A=12, B=11,K=4;
        double powStore =  Math.pow(A, B);
        System.out.println(powStore);
        String powinStr = Double.toString(powStore);
        StringBuilder sb = new StringBuilder(powinStr);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String revFormed = sb.toString();
        System.out.println(Character.getNumericValue(revFormed.charAt(K-1)));
    }
}
