package Recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n=1231;
        System.out.println(checkPalindrome(n));
    }
    static boolean checkPalindrome(int n){
        int noOfDigits=(int) Math.log10(n)+1;
        return (n==reverse(n,noOfDigits));
    }
    static int reverse(int n,int noOfDigits){
        if (n%10==n) return n;
        return (n%10)*(int)(Math.pow(10,noOfDigits-1)) +reverse(n/10,noOfDigits-1);
    }
}
