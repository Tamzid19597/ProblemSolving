package BitwiseOperator;
//001,010,011,100,101,110,111
public class NthMagicNumber {
    public static void main(String[] args) {
        int n=6;
        int base=5;
        System.out.println(findMagicNumber(n,base));
    }
    public static int findMagicNumber(int n,int b){
        int ans=0;
        int base=b;
        while (n>0){
            ans+=(n&1)*base;
            n=n>>1;
            base*=b;
        }
        return ans;
    }
}
