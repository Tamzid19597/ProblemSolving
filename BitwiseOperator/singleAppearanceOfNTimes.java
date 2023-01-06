package BitwiseOperator;
//Given an array where every element occurs three times, except one element which occurs only once.
// Find the element that occurs once. The expected time complexity is O(n) and O(1) extra space.
public class singleAppearanceOfNTimes {
    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,2,3,4,4,4};
        int appearance=3;
        System.out.println(findSingleAppearance(arr,appearance));
    }
    public static int findSingleAppearance(int []arr,int appearance){
        int INT_Length=32;
        int x,sum;
        int result=0;
        for (int i=0;i<INT_Length;i++){
            sum=0;
            x=(1<<i);
            for (int n:arr){
               sum+=(n&x);
            }
            if (sum%appearance!=0) result|=x;
        }
        return result;
    }
}
