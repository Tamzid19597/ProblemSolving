package MapHashMapAndHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//"Chennai" -> "Bengaluru"
//"Mumbai" -> "Delhi"
//"Goa" -> "Chennai"
//"Delhi" ->  "Goa
//Ans: "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"
public class FindItineraryFromTickets {
    static List<String> findItinerary(HashMap<String,String> hashMap){
        List<String>ans=new ArrayList<>();
        HashMap<String,String>reverseHashMap=new HashMap<>();
        String start="";
        for (String key: hashMap.keySet()){
            reverseHashMap.put(hashMap.get(key),key);
        }
        for (String key:reverseHashMap.keySet()){
            if (!reverseHashMap.containsKey(reverseHashMap.get(key))){
                start=reverseHashMap.get(key);
                break;
            }
        }
        while (hashMap.containsKey(start)){
            ans.add(start);
            start=hashMap.get(start);
        }
        ans.add(start);
        return ans;
    }
    public static void main(String[] args) {
        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("Chennai","Bengaluru");
        hashMap.put("Mumbai","Delhi");
        hashMap.put("Goa","Chennai");
        hashMap.put("Delhi","Goa");
        System.out.println(findItinerary(hashMap));
    }
}
