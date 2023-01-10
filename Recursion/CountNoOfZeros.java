package Recursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        int n=100230;
        System.out.println(noOfZeros(n));
    }
    static int noOfZeros(int n){
        int count=0;
        return noOfZerosHelper(n,count);
    }
    static int noOfZerosHelper(int n,int count){
        if (n%10==n) return count;
        if (n%10==0) return noOfZerosHelper(n/10,count+1);
        else return noOfZerosHelper(n/10,count);
    }
}
