package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(5));
    }
    static int nthFibonacci(int n){
        if (n<3){
            return n;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}

