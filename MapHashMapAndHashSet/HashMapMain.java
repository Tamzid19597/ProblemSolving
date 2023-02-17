package MapHashMapAndHashSet;

public class HashMapMain {
    public static void main(String[] args) {
        CustomHashMap<String,Integer>hashMap=new CustomHashMap<>();
        hashMap.put("a",10);
        hashMap.put("b",20);
        hashMap.put("c",30);
        hashMap.put("d",40);
        for (String key:hashMap.keySet()) {
            System.out.println(key+" : "+hashMap.get(key));
        }
        System.out.println(hashMap.containsKey("e"));
        System.out.println(hashMap.get("d"));
        System.out.println(hashMap.remove("d"));
        for (String key:hashMap.keySet()) {
            System.out.println(key+" : "+hashMap.get(key));
        }
    }
}
