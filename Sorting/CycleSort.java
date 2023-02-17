package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr={1,5,4,6,2,3};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] cycleSort(int[]arr){
        int i=0;
        while (i< arr.length){
            if (arr[i]!=i+1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
            else {
                i++;
            }
        }
        return arr;
    }
}
