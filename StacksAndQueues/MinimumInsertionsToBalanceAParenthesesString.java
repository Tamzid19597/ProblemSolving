package StacksAndQueues;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class MinimumInsertionsToBalanceAParenthesesString {
    static int minInsertions(String s) {
        int openingParenthesis=0;
        int closingParenthesis=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                closingParenthesis+=2;
                if(closingParenthesis%2!=0){
                    closingParenthesis--;
                    openingParenthesis++;
                }
            }
            else{
                closingParenthesis--;
                if(closingParenthesis<0){
                    openingParenthesis++;
                    closingParenthesis+=2;
                }
            }
        }
        return openingParenthesis+closingParenthesis;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
    }
}
