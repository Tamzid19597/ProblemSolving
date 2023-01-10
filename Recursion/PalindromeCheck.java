package Recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n=1221;
        System.out.println(checkPalindrome(n));
    }
    static boolean checkPalindrome(int n){
        return (n==reverse(n));
    }
    static int reverse(int n){
        int noOfDigits=(int)Math.log10(n)+1;
        return reverseHelper(n,noOfDigits);
    }
    static int reverseHelper(int n,int noOfDigits){
        if (n%10==n) return n;
        return (n%10)*(int)(Math.pow(10,noOfDigits-1)) +reverseHelper(n/10,noOfDigits-1);
    }
}
