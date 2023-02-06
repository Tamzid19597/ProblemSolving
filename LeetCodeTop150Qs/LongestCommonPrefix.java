package LeetCodeTop150Qs;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        String smallest=strs[0];
        String largest=strs[0];
        String prefix="";
        for(String s:strs){
            if(smallest.compareTo(s)>0)smallest=s;
            if(largest.compareTo(s)<0)largest=s;
        }
        for(int i=0;i<smallest.length();i++){
            if(smallest.charAt(i)==largest.charAt(i))prefix=prefix+smallest.charAt(i);
            else break;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
