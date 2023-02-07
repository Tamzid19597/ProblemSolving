package LeetCodeTop150Qs;
//https://leetcode.com/problems/plus-one/description/
import java.util.Arrays;

public class PlusOne_66 {
    static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i]==9)digits[i]=0;
            else {
                digits[i]=digits[i]+1;
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int[]digits={5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
