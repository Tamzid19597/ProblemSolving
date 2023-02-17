package LeetCodeTop150Qs;

public class ReverseInteger {
    static int reverse(int x) {
        int reverse=0;
        int abs=Math.abs(x);
        int digitCount=0;
        int temp=abs;
        while(temp!=0){
            temp=temp/10;
            digitCount++;
        }
        System.out.println(digitCount);
        while(digitCount<0){
            int num=(abs%10);
            abs=abs/10;
            reverse=reverse+num*((int)(Math.pow(10,digitCount)));
            digitCount--;
        }
        System.out.println(reverse);
        if(x<0)return reverse*(-1);
        return reverse;
    }

    public static void main(String[] args) {
        reverse(123);
    }
}
