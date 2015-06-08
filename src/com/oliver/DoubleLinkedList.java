package com.oliver;

public class DoubleLinkedList<T> {

    private DoubleLinkedListNode<T> head;
    private DoubleLinkedListNode<T> tail;

    public DoubleLinkedList() {

        head = tail = null;
    }

    public DoubleLinkedList(DoubleLinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");
        initializeHead(node);
    }


    public void setHead(DoubleLinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");

        node.setPrev(null);

        if(head == null) {
            initializeHead(node);
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
        }
    }

    public void setTail(DoubleLinkedListNode<T> node) {

        if(node == null) throw new IllegalArgumentException("New node must not be null.");

        if(tail == null) {
            initializeHead(node);
        } else {
            tail.setNext(node);
            tail = node;
            node.setNext(null);
        }
    }

    public DoubleLinkedListNode<T> removeHead() {

        if(head == null) return null;

        DoubleLinkedListNode<T> temp = head;

        if(head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }

        return temp;
    }

    public DoubleLinkedListNode<T> removeTail() {

        if(tail == null) return null;

        DoubleLinkedListNode<T> temp = tail;

        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }

        return temp;
    }

    public DoubleLinkedListNode<T> getHead() {

        return head;
    }

    public DoubleLinkedListNode<T> getTail() {

        return tail;
    }

    public void removeNode(DoubleLinkedListNode<T> node) {

        if(node.getPrev() == null) {
            removeHead();
        } else if(node.getNext() == null) {
            removeTail();
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
    }

    private void initializeHead(DoubleLinkedListNode<T> node) {

        head = tail = node;
        head.setPrev(null);
        head.setNext(null);
    }
}
