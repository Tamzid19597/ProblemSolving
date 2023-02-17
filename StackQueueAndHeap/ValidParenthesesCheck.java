package StackQueueAndHeap;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParenthesesCheck {
    static boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c))stack.push(map.get(c));
            else if(stack.isEmpty() || stack.peek()!=(c)) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("([{}]) is Valid: "+isValid("([{}])"));
        System.out.println("([{]}) is Valid: "+isValid("([{]})"));
    }
}
