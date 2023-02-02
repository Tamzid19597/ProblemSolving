package LeetCodeTop150Qs;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger{
    static class Solution {
        public int romanToInt(String s) {
            int ans=0;
            Map<Character,Integer>map=new HashMap<Character,Integer>();
            Map<String,Integer>map2=new HashMap<String,Integer>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            int num=0;
            for(int i=0;i<s.length();i++){
                if(map.get(s.charAt(i))>num) ans-=2*num;//Since the number added will be subtracted from answer twice for Example: MCM---->1000+100+1000-100-100, CM=M-C
                ans+=map.get(s.charAt(i));
                num=map.get(s.charAt(i));
            }
            return ans;
        }

        public static void main(String[] args) {
            System.out.println(new Solution().romanToInt("MCMXCIV"));
        }
    }
}
