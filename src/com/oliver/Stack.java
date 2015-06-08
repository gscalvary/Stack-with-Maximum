package com.oliver;

public class Stack<T extends Comparable<T>> {

    private DoubleLinkedList<T> stack;
    private DoubleLinkedList<DoubleLinkedListNode<T>> max;

    public Stack() {

        stack = new DoubleLinkedList<T>();
        max = new DoubleLinkedList<DoubleLinkedListNode<T>>();
    }

    public void push(T data) {

        DoubleLinkedListNode<T> newEntry = new DoubleLinkedListNode<T>(data);
        stack.setHead(newEntry);

        DoubleLinkedListNode<DoubleLinkedListNode<T>> maximum = max.getHead();

        if(maximum == null || maximum.getData().getData().compareTo(newEntry.getData()) <= 0) {
            max.setHead(new DoubleLinkedListNode<DoubleLinkedListNode<T>>(newEntry));
        }
    }

    public T pop() {

        DoubleLinkedListNode<T> popped = stack.removeHead();

        if(popped.getData().compareTo(max.getHead().getData().getData()) == 0) {
            max.removeHead();
        }

        return popped.getData();
    }

    public T getMax() {

        DoubleLinkedListNode<DoubleLinkedListNode<T>> maximum = max.getHead();

        return maximum.getData().getData();
    }

    public void print() {

        DoubleLinkedListNode<T> stackEntry = stack.getHead();

        if(stackEntry == null){
            System.out.println("\nThe stack is empty!");
        } else {
            System.out.print("\nThe stack: ");
        }

        while(stackEntry != null) {
            System.out.print(stackEntry.getData() + " ");
            stackEntry = stackEntry.getNext();
        }
        System.out.println();

        DoubleLinkedListNode<DoubleLinkedListNode<T>> maxEntry = max.getHead();

        if(maxEntry == null){
            System.out.println("The max stack is empty!");
        } else {
            System.out.print("The max stack: ");
        }

        while(maxEntry != null) {
            System.out.print(maxEntry.getData().getData() + " ");
            maxEntry = maxEntry.getNext();
        }
    }
}
