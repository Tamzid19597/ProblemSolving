package Sorting;
//https://leetcode.com/problems/missing-number/description/
public class MissingNumberInDistinctArray {
    public static void main(String[] args) {
        int [] arr={9,6,4,2,3,5,7,0,1};
        System.out.println((new Solution().missingNumber(arr)));
    }
}
class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        int missingNum=arr.length;
        while (i< arr.length){
            if (arr[i]!=i && arr[i]<arr.length) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j!=arr[j]){
                missingNum=j;
                break;
            }
        }
        return missingNum;
    }
}
