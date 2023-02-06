package LeetCodeTop150Qs;
//https://leetcode.com/problems/sqrtx/description/
public class SqrtOfX {
    static int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;//newtons law
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
