package BitwiseOperator;
//every  number appear twice only one appear once find that num ber
public class FindSingleAppearance {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,5,6,6,7,7};
        System.out.println(uniqueNumber(arr));
    }
    public static int uniqueNumber(int[]arr){
        int unique=0;
        for (int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
