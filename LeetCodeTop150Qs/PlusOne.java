package LeetCodeTop150Qs;

import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        for (int i = digits.length-1; i >= 0; i--) {
            if(i==0 && digits[i]==9){
                digits=new int[digits.length+1];
                for (int j = 0; j < digits.length; j++) {
                    if (j==0)digits[j]=1;
                    else digits[j]=0;
                }
                break;
            }
            if (digits[i]==9)digits[i]=0;
            else {
                digits[i]=digits[i]+1;
                break;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[]digits={5,6,2,0,0,4,6,2,4,9};
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
