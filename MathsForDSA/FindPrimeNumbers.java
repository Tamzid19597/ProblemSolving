package MathsForDSA;
//Time Complexity: O(n*(log(log(n))))
import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        int range=40;
        System.out.println(primeNumbers(range));
    }
    static List<Integer> primeNumbers(int range){
        Integer[]arr=new Integer[range+1];
        List<Integer> results=new ArrayList<>();
        for (int i=2;i<arr.length;i++){
            if (arr[i]==null){
                results.add(i);
            }
            int val=i;
            while (val<arr.length){
                arr[val]=1;
                val+=i;
            }
        }
        return results;
    }
}
