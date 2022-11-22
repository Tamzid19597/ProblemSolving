package Sorting;
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[]arr={3,4,-1,1};
        System.out.println(new SolutionOfFirstMissingPositive().firstMissingPositive(arr));
    }
}
class SolutionOfFirstMissingPositive{
    public int firstMissingPositive(int[] arr) {
        int i=0;
        int missingNum=arr.length+1;
        while (i<arr.length){
            if (arr[i]!=i+1 && arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[arr[i]-1]) {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j+1!=arr[j]){
                missingNum=j+1;
                break;
            }
        }
        return missingNum;
    }
}
