package StackQueueAndHeap;

import java.util.EmptyStackException;
import java.util.Stack;

public class ImplementQueueUsingStacks  {
    static class MyQueue {
        Stack<Integer> st1;
        Stack<Integer> st2;
        public MyQueue() {
            st1=new Stack<>();
            st2=new Stack<>();
        }

        public void push(int x) throws EmptyStackException {
            while(!this.st2.isEmpty()){
                this.st1.push(this.st2.pop());
            }
            this.st1.push(x);
            while(!this.st1.isEmpty()){
                this.st2.push(this.st1.pop());
            }
        }

        public int pop() {
            return this.st2.pop();
        }

        public int peek() {
            return this.st2.peek();
        }

        public boolean empty() {
            return this.st2.isEmpty();
        }
    }

    public static void main(String[] args) {
         MyQueue obj = new MyQueue();
         obj.push(1);
         obj.push(2);
         obj.push(3);
         int param_2 = obj.pop();
         int param_3 = obj.peek();
         boolean param_4 = obj.empty();
        System.out.println(param_2+" "+param_3+" "+param_4);
    }
}
