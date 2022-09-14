package com.course.datastructure.stack.test;

import com.course.datastructure.stack.GenericStack;

import java.util.Stack;

public class test1 {
    public static void main(String args[]) throws Exception {
        GenericStack<Integer> stack = new GenericStack<>();

        Stack<Integer> stackOriginal = new Stack<>();

        stackOriginal.peek();

        for(int i=0; i<10; i++){
            stack.push(i + 1 );
        }

        
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
