package BitwiseOperator;
//Given a number find it is odd or even
public class OddOrEven {
    public static void main(String[] args) {
        int n=4;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
