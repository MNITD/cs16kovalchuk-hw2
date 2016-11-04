package main.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList immutableLinkedList;

    public Stack() {
        immutableLinkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return immutableLinkedList.getLast();
    }

    Object pop() {
        Object obj = immutableLinkedList.getLast();
        immutableLinkedList = immutableLinkedList.removeLast();
        return obj;
    }

    void pop(Object e) {
        immutableLinkedList = immutableLinkedList.addLast(e);
    }
}
