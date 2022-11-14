package BinarySearch;
//https://www.codingninjas.com/codestudio/problems/ceiling-in-a-sorted-array_1825401 {Problem link}
public class CeilingInSortedArray {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,7,10};
        System.out.println(ceilingInSortedArray(arr.length,6,arr));
    }
    public static int ceilingInSortedArray(int n, int target, int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=start+((end-start)/2);
        int ceiling=target-1;
        boolean asc=arr[0]<arr[arr.length-1];

        while(start<=end){
            mid=start+((end-start)/2);
            if(arr[mid]==target){
                return arr[mid];
            }
            if(asc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    ceiling=arr[mid];
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    ceiling=arr[mid];
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        if(ceiling>=target){
            return ceiling;
        }
        return -1;
    }
}
