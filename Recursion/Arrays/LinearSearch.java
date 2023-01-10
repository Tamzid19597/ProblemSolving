package Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,3,5,6,7,8};
        System.out.println(findIndex(arr,7));
    }
    static int findIndex(int []arr,int num){
        int index=0;
        return findIndexHelper(arr,num,index);
    }
    static int findIndexHelper(int []arr,int num,int index){
        if (index==arr.length) return -1;
        if (arr[index]==num) return index;
        return findIndexHelper(arr,num,index+1);
    }
}
