package MathsForDSA;

public class SqrtOfANum {
    public static void main(String[] args) {
        int n=36;
        System.out.println(binarySearchSqrt(n));
    }
    static int binarySearchSqrt(int n){
        int start=0;
        int end=n;
        int mid;
        while (start<end){
            mid=start+((end-start)/2);
            if (mid*mid==n){
                break;
            }
            else if (mid*mid>n){
                end=mid-1;
            }
            else start=mid+1;
        }
        return end;
    }
}
