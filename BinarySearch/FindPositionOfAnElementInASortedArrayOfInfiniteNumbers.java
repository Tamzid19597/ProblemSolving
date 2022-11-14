package BinarySearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/ {Question link}
public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,};
        System.out.println(positionFinder(arr,5));
    }
    static int positionFinder(int[]arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1);
            start=temp;
        }
        int ans=binarySearch(start,end,arr,target);
        return ans;
    }
    static int binarySearch(int start,int end, int[]arr,int target){
        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[mid]==target){
                return mid;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
