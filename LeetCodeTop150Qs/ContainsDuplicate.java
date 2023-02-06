package LeetCodeTop150Qs;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();
        for(int num:nums){
            if(set.contains(num))return true;
            else set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
}
