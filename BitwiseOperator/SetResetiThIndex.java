package BitwiseOperator;

public class SetResetiThIndex {
    public static void main(String[] args) {
        int n=0b0110;
        int i=2;
        byte b=0;
        System.out.println(Integer.toBinaryString(setIndex(n,i,b)));
    }
    public static int setIndex(int n,int i,byte b){
        if (b==1){
            return n|(1<<(i-1));
        }
        else return n&(~(1<<(i-1)));
    }
}
