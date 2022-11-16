package BinarySearch;

import java.util.Arrays;

public class BinarySearchIn2DSortedArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(rowEliminationSearch(arr,2)));
    }
    static int[] columnSearch(int row,int colStart,int colEnd,int[][]arr,int target){
        int [] index={-1,-1};
        while (colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if (arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if (arr[row][mid]>target && colEnd>0){
                colEnd=mid-1;
            }
            else if (colStart<arr[0].length-1){
                colStart=mid+1;
            }
        }
        return index;
    }

    static int[] rowEliminationSearch(int[][]arr,int target){
        int [] index={-1,-1};
        int rowStart=0;
        int rowEnd=arr.length-1;
        int colMid=0+(arr[0].length-1)/2;
        while (rowStart<rowEnd-1){
            int rowMid=rowStart+(rowEnd-rowStart)/2;
            if (arr[rowMid][colMid]==target){
                return new int[]{rowMid,colMid};
            }
            else if (target>arr[rowMid][colMid]) {
                rowStart=rowMid;
            }
            else {
                rowEnd=rowMid;
            }
        }
        if (target==arr[rowStart][colMid]){
            return new int[]{rowStart,colMid};
        }
        else if (target==arr[rowStart+1][colMid]){
            return new int[]{rowStart+1,colMid};
        }
        if (target<arr[rowStart][colMid] && colMid>0){
            return columnSearch(rowStart,0,colMid-1,arr,target);
        }
        if (target>arr[rowStart][colMid] && colMid<arr.length-1 && target<=arr[rowStart][arr[rowStart].length-1]){
            return columnSearch(rowStart,colMid+1,arr.length-1,arr,target);
        }
        if (target<arr[rowStart+1][colMid] && colMid>0){
            return columnSearch(rowStart+1,0,colMid-1,arr,target);
        }
        if ((target>arr[rowStart+1][colMid] && colMid<arr.length-1)){
            return columnSearch(rowStart+1,colMid+1,arr.length-1,arr,target);
        }
        return index;
    }
}

