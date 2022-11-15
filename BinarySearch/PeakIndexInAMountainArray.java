package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/ {Problem link}
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,4,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<=end){
            mid=start+((end-start)/2);
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }

        }
        return -1;
    }
}
