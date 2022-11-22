package Sorting;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,2};
        //solution 2 is better
        System.out.println("Solution 1: "+new SolutionOFFindTheDuplicateNumber1().findDuplicate(arr));
        System.out.println("Solution 2: "+new SolutionOFFindTheDuplicateNumber2().findDuplicate(arr));
    }
}
class SolutionOFFindTheDuplicateNumber1{
    public int findDuplicate(int[] arr) {
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
                return arr[j];
            }
        }
        return -1;
    }
}
class SolutionOFFindTheDuplicateNumber2{
    public int findDuplicate(int[] arr) {
        int i=0;
        while (i<arr.length){
            if (arr[i]!=i+1) {
                if(arr[i]==arr[arr[i]-1]){
                    return arr[i];
                }
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp - 1] = temp;
            }
            else {
                i++;
            }
        }
        return -1;
    }
}
