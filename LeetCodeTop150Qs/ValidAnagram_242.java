package LeetCodeTop150Qs;

import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram_242 {
        static boolean isAnagram(String s, String t) {
            HashMap<Character,Integer>hMap=new HashMap<>();
            if(s.length()!=t.length())return false;
            for(char c:s.toCharArray()){
                if(hMap.containsKey(c)){
                    hMap.put(c,hMap.get(c)+1);
                }
                else hMap.put(c,1);
            }
            for(char c:t.toCharArray()){
                if(!hMap.containsKey(c))return false;
                else if(hMap.get(c)==0){
                    return false;
                }
                else  hMap.put(c,hMap.get(c)-1);
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(isAnagram("aabc","bcaa"));
        System.out.println(isAnagram("aabc","aacc"));
    }
}
