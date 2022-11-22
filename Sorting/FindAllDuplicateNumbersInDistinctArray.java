package Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicateNumbersInDistinctArray {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(new SolutionOFFindAllDuplicateNumbersInDistinctArray().findDuplicates(arr));
    }
}
class SolutionOFFindAllDuplicateNumbersInDistinctArray{
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>duplicateNums=new ArrayList<>();
        int i=0;
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
                duplicateNums.add(arr[j]);
            }
        }
        return duplicateNums;
    }
}