package LeetCodeTop150Qs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])) {
                    return new int[]{map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{0,0};
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{1,2,3,4,5},7)));
    }
}
