package LeetCodeTop150Qs;
//https://leetcode.com/problems/single-number/description/
public class SingleNumber_136 {
    static int singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[]nums={1,1,2,3,3,4,4};
        System.out.println(singleNumber(nums));
    }
}
