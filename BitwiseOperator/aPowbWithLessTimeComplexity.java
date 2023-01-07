package BitwiseOperator;
//Time complexity of a^b is O(log(b))
public class aPowbWithLessTimeComplexity {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(calcAPowB(a,b));
    }
    static int calcAPowB(int a,int b){
        int base=(int) (Math.log(b)/Math.log(2))+1;
        int sum=a;
        int result=1;
        for (int i=0;i<=base;i++){
            if ((1<<i & b) !=0){
                result*=sum;
            }
            sum*=sum;
        }
        return result;
    }
}
