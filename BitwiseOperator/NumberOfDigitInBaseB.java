package BitwiseOperator;

public class NumberOfDigitInBaseB {
    public static void main(String[] args) {
        int  n=10;
        int base=2;
        System.out.println(numberOfDigit(n,base));
    }
    static int numberOfDigit(int n,int base){
        return (int)((Math.log(n))/(Math.log(base)))+1;
    }
}
