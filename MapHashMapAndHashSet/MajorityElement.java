package MapHashMapAndHashSet;

import java.util.*;

//Given an integer array of size n, find all elements that appear more than  n/3  times.
public class MajorityElement {
    static List<Integer>majorityElement(int[]arr){
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int num:arr) {
            if (hashMap.containsKey(num))hashMap.put(num,hashMap.get(num)+1);
            else hashMap.put(num,1);
        }
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
            if (entry.getValue()>=arr.length/3)ans.add(entry.getKey());
        }
        //or we can use
        /*
        for (int key:hashMap.keySet()) {
            if (hashMap.get(key)>=arr.length/3)ans.add(key);
        }
        */
        return ans;
    }


    public static void main(String[] args) {
        System.out.println((majorityElement(new int[]{1,2,3,3,1,1,1,5,5})));
    }
}
