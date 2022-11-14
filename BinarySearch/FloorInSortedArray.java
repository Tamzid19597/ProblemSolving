package BinarySearch;
//https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1 {problem link}
public class FloorInSortedArray {
    public static void main(String[] args) {
        long [] arr={1,2,4,5,6,10};
        System.out.println(findFloor(arr, arr.length,3));
    }
    static int findFloor(long [] arr, int n, long target)
    {
        int start=0;
        int end=arr.length-1;
        int mid=start+((end-start)/2);
        long flor=target+1;
        int florIndex=0;;
        boolean asc=arr[0]<arr[arr.length-1];

        while(start<=end){
            mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(target>arr[mid]){
                    flor=arr[mid];
                    florIndex=mid;
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    flor=arr[mid];
                    florIndex=mid;
                    start=mid+1;
                }
            }
        }
        if(flor<=target){
            return florIndex;
        }
        return end;

    }
}
