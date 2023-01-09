package MathsForDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n=20;
        System.out.println(findFactors(n));
    }
    static List<Integer> findFactors(int n){
        int c=1;
        List<Integer>result1=new ArrayList<>();
        List<Integer>result2=new ArrayList<>();
        while (c*c<=n){
            if (n%c==0){
                if (c*c==n){
                    result1.add(c);
                }
                else {
                    result1.add(c);
                    result2.add(n/c);
                }
            }
            c++;
        }
        Collections.reverse(result2);
        result1.addAll(result2);
        return result1;
    }

}
