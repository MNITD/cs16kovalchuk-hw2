package test.java.ua.edu.ucu.collections.immutable;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    
    @Test
    public void testSomeMethod() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = (ImmutableLinkedList) immutableLinkedList.add(new Integer(5));
    }
    
}
