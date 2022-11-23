package StringAndStringbuilder;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("aba"));
    }
    static boolean palindromeCheck(String s){
        if (s==null){
            return true;
        }
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while (start<=end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
