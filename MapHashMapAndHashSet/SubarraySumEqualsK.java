package MapHashMapAndHashSet;

import java.util.Arrays;
import java.util.HashMap;
//https://leetcode.com/problems/subarray-sum-equals-k/description/git add
public class SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,1);
        int sum=0;
        int totalSubArr=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hashMap.containsKey(sum-k))totalSubArr+=hashMap.get(sum-k);
            if(hashMap.containsKey(sum))hashMap.put(sum,hashMap.get(sum)+1);
            else hashMap.put(sum,1);
        }
        return totalSubArr;
    }

    public static void main(String[] args) {
        int [] arr={0,0,0,0};
        int k=0;
        System.out.println(Arrays.toString(arr)+",K="+k);
        System.out.println(subarraySum(arr,k));
    }
}
