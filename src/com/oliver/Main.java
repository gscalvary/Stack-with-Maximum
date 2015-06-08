package com.oliver;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(10);
        stack.push(2);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.push(1);
        stack.push(10);
        stack.push(2);
        stack.print();
        System.out.println("\nThe max entry is: " + stack.getMax());
        stack.print();
    }
}
