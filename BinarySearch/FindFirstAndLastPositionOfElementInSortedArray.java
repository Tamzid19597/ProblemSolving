package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int[]range=searchRange(arr,8);
        System.out.println(Arrays.toString(range));
    }
    static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        int [] range={-1,-1};
        if(start>end){
            return range;
        }
        while(start<=end){
            if(nums[end]==target){
                range[1]=end;
                break;
            }
            mid=start+((end-start)/2);
            if(nums[mid]==target){
                if(nums[mid+1]==target){
                    range[1]=mid+1;
                    start=mid+1;
                }
                else{
                    range[1]=mid;
                    break;
                }
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        start=0;
        end=nums.length-1;
        while(start<=end){
            if(nums[start]==target){
                range[0]=start;
                break;
            }
            mid=start+((end-start)/2);
            if(nums[mid]==target){
                if(nums[mid-1]==target){
                    range[0]=mid-1;
                    end=mid-1;
                }
                else{
                    range[0]=mid;
                    break;
                }
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return range;
    }
}
