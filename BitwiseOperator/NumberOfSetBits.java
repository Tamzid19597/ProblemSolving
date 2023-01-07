package BitwiseOperator;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n=10;
        System.out.println(numberOfSetBit(n));
    }
    static int numberOfSetBit(int n){
        int c=0;
        while (n>0){
            c++;
            n-=n&(-n);
        }
        return c;
    }
}
