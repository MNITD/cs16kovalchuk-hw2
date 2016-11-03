package main.java.ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {

    private Node head;

    private int listLength = 0;

    //
    //----------------------------- private nested class Node  ----------------------------
    // contains data, instances(pointers) of(to) sibling nodes, node-adding methods
    //
    private class Node {
        private Node nextElem = null;
        private Object data;

        Node(Object d) {
            this.data = d;
        }

        Node addNext(Object d) {
            this.nextElem = new Node(d);
            return nextElem;
        }

        boolean hasNext() {
            return this.nextElem != null;
        }

        Object getData() {
            return data;
        }


        Node getNext() {
            return nextElem;
        }

    }
    //
    //----------------------------- End of Node  -----------------------------
    //

    public ImmutableLinkedList() {

    }

    // private constructor for add(Object e)
    private ImmutableLinkedList(Node prevListHead, Object object, int prevListLength) {
        super();

        this.listLength = prevListLength + 1;

        if (prevListHead != null) {
            this.head = new Node(prevListHead.getData());
            Node tail = this.head;
            copyList(tail, prevListHead);
            tail.addNext(object);
        } else {
            this.head = new Node(object);
        }
    }

    // private constructor for add(int index, Object e)
    private ImmutableLinkedList(Node prevListHead, int index, Object object, int prevListLength) {
        super();

        this.listLength = prevListLength + 1;

        this.head = new Node(prevListHead.getData());
        Node tail = this.head;
        for (int i = 0; i < index; i++) {
            prevListHead = prevListHead.getNext();
            tail = tail.addNext(prevListHead.getData());
        }
        tail = tail.addNext(object);
        copyList(tail, prevListHead);
    }

    // private constructor for add(Object e)
    private ImmutableLinkedList(Node prevListHead, Object[] objects, int prevListLength) {
        super();

        this.listLength = prevListLength + 1;

        Node tail;

        if (prevListHead != null) {
            this.head = new Node(prevListHead.getData());
            tail = this.head;
            copyList(tail, prevListHead);
            tail.addNext(objects[0]);
        } else {
            this.head = new Node(objects[0]);
            tail = this.head;
        }
        for (int i = 1; i < objects.length; i++) {
            tail.addNext(objects[i]);
        }
    }

    // private constructor for addAll(int index, Object[] c)
    private ImmutableLinkedList(Node prevListHead, int index, Object[] objects, int prevListLength) {
        super();

        this.listLength = prevListLength + 1;

        this.head = new Node(prevListHead.getData());
        Node tail = this.head;
        for (int i = 0; i < index; i++) {
            prevListHead = prevListHead.getNext();
            tail = tail.addNext(prevListHead.getData());
        }
        for (int i = 0; i < objects.length; i++) {
            tail = tail.addNext(objects[i]);
        }
        copyList(tail, prevListHead);
    }

    // private constructor for remove(int index)
    private ImmutableLinkedList(Node prevListHead, int index, int prevListLength) {
        super();

        this.listLength = prevListLength + 1;

        Node tail;
        if (index != 0) {
            this.head = new Node(prevListHead.getData());
            tail = this.head;
            for (int i = 1; i < listLength; i++) {
                prevListHead = prevListHead.getNext();
                if (i == index) {
                    prevListHead = prevListHead.getNext();
                }
                tail = tail.addNext(prevListHead.getData());

            }
        } else {
            this.head = new Node(prevListHead.getNext().getData());
            tail = this.head;
            copyList(tail, prevListHead);
        }

    }

    // called from private constructor
    private void copyList(Node tail, Node prevListHead) {
        while (prevListHead.hasNext()) {
            prevListHead = prevListHead.getNext();
            tail = tail.addNext(prevListHead.getData());
        }
    }

    @Override
    public ImmutableList add(Object e) {
        return new ImmutableLinkedList(head, e, listLength); // call private constructor from the zero level
    }

    @Override
    public ImmutableList add(int index, Object e) {
        try {
            if (index >= listLength) {
                throw new Exception("Index is out of boundary");
            }
        } catch (Exception ex) {
            return null;
        }
        return new ImmutableLinkedList(head, index, e, listLength);

    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return new ImmutableLinkedList(head, c, listLength);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        try {
            if (index >= listLength) {
                throw new Exception("Index is out of boundary");
            }
        } catch (Exception ex) {
            return null;
        }
        return new ImmutableLinkedList(head, index, c, listLength);
    }

    @Override
    public Object get(int index) {
        try {
            if (index >= listLength) {
                throw new Exception("Index is out of boundary");
            }
        } catch (Exception ex) {
            return null;
        }
        Node tail = this.head;
        for (int i = 0; i <= index; i++) {
            tail = tail.getNext();
        }
        return tail.getData();
    }

    @Override
    public ImmutableList remove(int index) {
        try {
            if (index >= listLength) {
                throw new Exception("Index is out of boundary");
            }
        } catch (Exception ex) {
            return null;
        }
        return new ImmutableLinkedList(head, index, listLength);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        try {
            if (index >= listLength) {
                throw new Exception("Index is out of boundary");
            }
        } catch (Exception ex) {
            return null;
        }
        return remove(index).add(index);
    }

    @Override
    public int indexOf(Object e) {
        Node tail = this.head;
        for(int i = 0; i < this.listLength; i++){
            if(tail.getData().equals(e)){
                return i;
            }
            tail = tail.getNext();
        }
        return -1;
    }

    @Override
    public int size() {
        return listLength;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return this.listLength == 0;
    }

    @Override
    public Object[] toArray() {
        Object [] c = new Object[this.listLength];
        Node tail = this.head;
        for(int i = 0; i < this.listLength; i++){
            c[i] = tail.getData();
            tail = tail.getNext();
        }
        return c;
    }

    @Override
    public String toString(){
        String result = null;
        Node tail = this.head;
        for(int i = 0; i < this.listLength-1; i++){
            result = tail.getData().toString() + ", ";
            tail = tail.getNext();
        }
        result += tail.getData().toString();
        return  result;
    }
}
