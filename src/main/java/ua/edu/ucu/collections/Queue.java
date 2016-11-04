package main.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList immutableLinkedList;

    public Queue() {
        immutableLinkedList = new ImmutableLinkedList();
    }

    Object peek() {
        return immutableLinkedList.getFirst();
    }

    Object dequeue() {
        Object obj = immutableLinkedList.getFirst();
        immutableLinkedList = immutableLinkedList.removeFirst();
        return obj;
    }

    void enqueue(Object e) {
        immutableLinkedList = immutableLinkedList.add(e);
    }
}
