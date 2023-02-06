package LeetCodeTop150Qs;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] nums) {
        if(nums.length==1)return 1;
        int k=1;
        for(int num:nums){
            if(num>nums[k-1])nums[k++]=num;
        }
        return k;
    }

    public static void main(String[] args) {
        int[]nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println("K="+removeDuplicates(nums)+","+Arrays.toString(nums));
    }
}
