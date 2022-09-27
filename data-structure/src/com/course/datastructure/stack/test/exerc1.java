package com.course.datastructure.stack.test;

import java.util.Stack;

public class exerc1 {
    public static void main(String args[]){
        printResult(2);
        printResult(4);
        printResult(10);
        printResult(25);
        printResult(10053);


    }

    public static void printResult(int number){
        System.out.println(number + " in binary is:" + decimalToBinary(number));
    }

    public static String decimalToBinary(int number){
        Stack<Integer> stack = new Stack<>();
        String binary = "";
        int result;

        while (number > 0){
            result = number%2;
            stack.push(result);
            number/=2;
        }

        while (!stack.isEmpty()){
            binary += stack.pop();
        }
        return binary;
    }
}
