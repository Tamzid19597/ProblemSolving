package BinarySearch;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={ {10,15,20},
                      {15,25,35},
                      {40,45,50}
                         };
        System.out.println(Arrays.toString(search(arr,35)));
    }
    static int[] search(int [][] arr,int target){
        int row=0;
        int col=arr.length-1;
        int [] index={-1,-1};
        while (row<arr.length-1 && col>=0){
            if (arr[row][col]==target){
                index[0]=row;
                index[1]=col;
                return index;
            }
            else if (arr[row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }
        return index;
    }
}
