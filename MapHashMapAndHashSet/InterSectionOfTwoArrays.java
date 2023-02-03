package MapHashMapAndHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class InterSectionOfTwoArrays {
    static List<Integer> intersection(int[]a,int[]b){
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Boolean>hashMap=new HashMap<>();
        for (int num:a){
            if (hashMap.containsKey(num))hashMap.put(num,true);
            else hashMap.put(num,false);
        }
        for (int num:b){
            if (hashMap.containsKey(num))hashMap.put(num,true);
            else hashMap.put(num,false);
        }
        for (int key: hashMap.keySet()){
            if (hashMap.get(key))ans.add(key);
        }
        return ans;
    }
    static List<Integer> intersectionAlternative(int[]a,int[]b){
        List<Integer>ans=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num:a){
            hashSet.add(num);
        }
        for (int num:b){
            if (hashSet.contains(num))ans.add(num);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(intersection(new int[]{1,2,3,4,5},new int[]{3,4,6,7,8,9}));
        System.out.println(intersectionAlternative(new int[]{1,2,3,4,5},new int[]{3,4,6,7,8,9}));
    }
}
