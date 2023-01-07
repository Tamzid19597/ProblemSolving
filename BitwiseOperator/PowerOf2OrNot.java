package BitwiseOperator;

public class PowerOf2OrNot {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOf2(n));
    }
    static boolean isPowerOf2(int n){
        return ((int) n&(n-1))==0;
    }
}
