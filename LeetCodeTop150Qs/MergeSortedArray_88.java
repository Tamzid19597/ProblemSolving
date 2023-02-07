package LeetCodeTop150Qs;

import java.util.Arrays;
//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray_88 {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]mergeArr=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mergeArr[k]=nums1[i];
                k++;
                i++;
            }
            else{
                mergeArr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            mergeArr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            mergeArr[k]=nums2[j];
            k++;
            j++;
        }
        for(int x=0;x<nums1.length;x++){
            nums1[x]=mergeArr[x];
        }
    }

    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,4,5,0,0,0};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
