package com.oliver;

public class DoubleLinkedListNode<T> {

    private T data;
    private DoubleLinkedListNode<T> prev;
    private DoubleLinkedListNode<T> next;

    public DoubleLinkedListNode(T data) {

        this.data = data;
        next = prev = null;
    }

    public DoubleLinkedListNode(T data, DoubleLinkedListNode<T> next) {

        this.data = data;
        prev = null;
        this.next = next;
    }

    public DoubleLinkedListNode(T data, DoubleLinkedListNode<T> prev, DoubleLinkedListNode<T> next) {

        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    public DoubleLinkedListNode<T> getNext() {

        return next;
    }

    public void setNext(DoubleLinkedListNode<T> next) {

        this.next = next;
    }

    public DoubleLinkedListNode<T> getPrev() {

        return prev;
    }

    public void setPrev(DoubleLinkedListNode<T> prev) {

        this.prev = prev;
    }
}
