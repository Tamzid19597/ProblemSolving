package MapHashMapAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UnionOfTwoArrays {
    static List<Integer> unionOfArrays(int[]a,int[]b){
        List<Integer>ans=new ArrayList<>();
        HashSet<Integer>hashSet=new HashSet<>();
        for (int num:a) {
            hashSet.add(num);
        }
        for (int num:b) {
            hashSet.add(num);
        }
        Iterator iterator= hashSet.iterator();
        while (iterator.hasNext())ans.add((Integer) iterator.next());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(unionOfArrays(new int[]{1,2,3,4},new int[]{2,3,4,5,6}));
    }
}
