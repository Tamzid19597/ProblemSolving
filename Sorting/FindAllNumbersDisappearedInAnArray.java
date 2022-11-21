package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(new SolutionOFFindAllNumbersDisappearedInAnArray().findDisappearedNumbers(arr));
    }
}
class SolutionOFFindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        List<Integer>missingNum=new ArrayList<>();
        while (i<arr.length){
            if (arr[i]!=i+1 && arr[i]!=arr[arr[i]-1] && arr[i]<=arr.length) {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp - 1] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if((j+1)!=arr[j]){
                missingNum.add(j+1);
            }
        }
        return missingNum;
    }
}
