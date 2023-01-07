package BitwiseOperator;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(XOR(b)^XOR(a-1));
    }
    static int XOR(int x){
        if (x%4==0){
            return x;
        }
        if (x%4==1){
            return 1;
        }
        if ((x%4==2)){
            return x+1;
        }
        else return 0;
    }
}
