package LeetCodeTop150Qs;
//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome_125 {
    static boolean isPalindrome(String s) {
        if(s.length()==1)return true;
        for(int i=0,j=s.length()-1;j>=i;i++,j--){
            int iNumeric=Character.getNumericValue(s.charAt(i));
            int jNumeric=Character.getNumericValue(s.charAt(j));
            if(iNumeric!=-1 && jNumeric!=-1){
                if(iNumeric!=jNumeric)return false;
            }
            else if (iNumeric!=-1){
                i--;
            }
            else j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }
}
