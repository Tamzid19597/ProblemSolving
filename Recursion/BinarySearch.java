package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length-1,7));
    }
    static int binarySearch(int[]arr,int start,int end,int n){
        int mid=start+(end-start)/2;
        if (start>end){
            return -1;
        }
        if (n==arr[mid]){
            return mid;
        }
        else if (n>arr[mid]) {
          return   binarySearch(arr,mid+1,end,n);
        }
        else {
          return   binarySearch(arr,start,mid-1,n);
        }

    }
}
