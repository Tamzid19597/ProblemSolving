package StackQueueAndHeap;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinimumAddToMakeParenthesesValid {
    static int minAddToMakeValid(String s) {
        int moves=0;
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c))stack.push(map.get(c));
            else if(stack.isEmpty() || stack.peek()!=(c)) moves++;
            else stack.pop();
        }
        while (!stack.isEmpty()){
            moves++;
            stack.pop();
        }
        return moves;
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }
}
