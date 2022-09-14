package com.course.datastructure.stack.test;

import java.util.Stack;

public class ExercHanoiTower {

    public static void main(String[] args){
        final Stack<Integer> originalTower = new Stack<>();
        final Stack<Integer> assistantTower = new Stack<>();
        final Stack<Integer> finalTower = new Stack<>();

        originalTower.push(4);
        originalTower.push(3);
        originalTower.push(2);
        originalTower.push(1);
        resolveHanoiTower(originalTower.size(), originalTower,finalTower, assistantTower);


    }

    public static void resolveHanoiTower(int numberOfElement,Stack<Integer> originalTower,Stack<Integer> finalTower, Stack<Integer> assistantTower  ){
        if(numberOfElement > 0){
            resolveHanoiTower(numberOfElement-1, originalTower, assistantTower, finalTower);
            finalTower.push(originalTower.pop());
            System.out.println("-------");
            System.out.println("This is the Original: " + originalTower);
            System.out.println("This is the Assistant: " + assistantTower);
            System.out.println("This is the Final: " + finalTower);
            resolveHanoiTower(numberOfElement-1, assistantTower, finalTower, originalTower);
        }
    }
}
