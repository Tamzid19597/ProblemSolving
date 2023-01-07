package BitwiseOperator;

public class PascalSeriesSumOfNthRow {
    public static void main(String[] args) {
        int n=5;
        System.out.println(FindSeriesSu(n));
    }
    static int FindSeriesSu(int n){
        return 1<<(n-1);
    }
}
