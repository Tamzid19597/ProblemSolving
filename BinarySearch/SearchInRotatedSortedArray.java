package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/ {Problem link}
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2,3};
        System.out.println(search(arr,5));
    }
    static int search(int[] nums, int target) {
        int peakIndex=pivotIndexInRotatedArray(nums);
        int existanceInFirst=binarySearch(0,peakIndex,target,true,nums);
        int length=nums.length-1;
        if(nums[0]==target){
            return 0;
        }
        else if(nums[nums.length-1]==target){
            return nums.length-1;
        }
        if(existanceInFirst>=0){
            return existanceInFirst;
        }
        else{
            if(peakIndex==nums.length-1){
                if(nums[nums.length-1]==target){
                    return nums.length-1;
                }
                else{
                    return -1;
                }

            }
            int existanceInLast=binarySearch(peakIndex+1,length,target,true,nums);
            return existanceInLast;
        }
    }
    static int pivotIndexInRotatedArray(int [] arr) {
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<end){
            mid=start+((end-start)/2);
            if(arr[mid+1]<arr[mid]){
                return mid;
            }
            else if(mid-1>-1 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int binarySearch(int start,int end,int target, boolean asc,int [] arr){
        asc=arr[start]<=arr[end];
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
