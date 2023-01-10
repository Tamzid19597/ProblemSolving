package Recursion.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,3,5,5};
        System.out.println(checkSortedOrNot(arr));
    }
    static boolean checkSortedOrNot(int []arr){
        int pointer=0;
        return checkSortedOrNotHelper(arr,pointer);
    }
    static boolean checkSortedOrNotHelper(int[]arr,int pointer){
        if (pointer==arr.length-1)return true;
        if (arr[pointer]>arr[pointer+1])return false;
        else return checkSortedOrNotHelper(arr,pointer+1);
    }
}
