package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/ {Problem link}
public class FindInMountainArray implements MountainArray {
    public static void main(String[] args) {
        MountainArray mountainArray=new MountainArray() {
            @Override
            public int get(int index) {
                return MountainArray.super.get(index);
            }

            @Override
            public int length() {
                return MountainArray.super.length();
            }
        };
        System.out.println(findInMountainArray(3,mountainArray));
    }
    static int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex=peakIndexInMountainArray(mountainArr);
        int existanceInFirst=binarySearch(0,peakIndex,target,true,mountainArr);
        int length=mountainArr.length()-1;
        if(existanceInFirst>=0){
            return existanceInFirst;
        }
        else{
            int existanceInLast=binarySearch(peakIndex,length,target,false,mountainArr);
            return existanceInLast;
        }
    }
    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
        int mid;

        while(start<end){
            mid=start+((end-start)/2);
            if(mountainArr.get(mid+1)>mountainArr.get(mid)){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return start;
    }
    static int binarySearch(int start,int end,int target, boolean asc,MountainArray mountainArr){
        while(start<=end){
            int mid=start+((end-start)/2);
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(asc){
                if(target>mountainArr.get(mid)){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>mountainArr.get(mid)){
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
