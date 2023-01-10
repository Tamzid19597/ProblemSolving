package Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,8,1,2,3};
        System.out.println(findIndex(arr,9));
    }
    static int findIndex(int []arr,int num){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        return findIndexHelper(arr,num,start,end);
    }
    static int findIndexHelper(int [] arr,int num,int start,int end){
        if (start>end)return end;
        int mid=start+(end-start)/2;
        if (arr[mid]==num) return mid;
        if (arr[mid]>arr[start]){
            if (num>=arr[start] && num<=arr[mid]) {
                return findIndexHelper(arr,num,start,mid-1);
            }
            else findIndexHelper(arr,num,mid+1,end);
        }
        if (num<=arr[end] && num>=arr[mid]) return findIndexHelper(arr,num,mid+1,end);
        else return findIndexHelper(arr,num,start,mid-1);

    }
}
