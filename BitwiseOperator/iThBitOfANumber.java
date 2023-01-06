package BitwiseOperator;

public class iThBitOfANumber {
    public static void main(String[] args) {
        int n=13;
        int i=1;
        System.out.println(iThBitFinder(n,i));
    }
    public static int iThBitFinder(int n,int i){
        return n&(1<<(i-1));
    }
}
