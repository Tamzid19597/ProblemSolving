package BitwiseOperator;

public class RightMostSetBitPosition {
    public static void main(String[] args) {
        int n=10;
        System.out.println(findRightmostSetBit(n));
    }
    public static int findRightmostSetBit(int n){
        return n&(-n);
    }
}
