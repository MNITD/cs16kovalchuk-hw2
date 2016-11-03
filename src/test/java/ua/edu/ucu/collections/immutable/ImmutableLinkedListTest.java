package test.java.ua.edu.ucu.collections.immutable;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    private class TestParameters{

    }
    @Test
    public void testAdd() {
        // setup input data and expected result

        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(5));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(6));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(7));
        Object[] expResult ={new Integer(5), new Integer(6), new Integer(7)};

        // call tested method
        Object[] actualResult = immutableLinkedList3.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddByIndex() {
        // setup input data and expected result

        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object[]arr = {new Integer(5),new Integer(6),new Integer(7)};
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.addAll(arr);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(1 ,new Integer((8)));

        Object[] expResult ={new Integer(5), new Integer(8), new Integer(6), new Integer(7)};

        // call tested method
        Object[] actualResult = immutableLinkedList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object[]arr = {new Integer(5),new Integer(6),new Integer(7), new Integer(8), new Integer(9)};
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.addAll(arr);

        Object[] expResult ={new Integer(5), new Integer(6), new Integer(7), new Integer(8), new Integer(9)};

        // call tested method
        Object[] actualResult = immutableLinkedList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllByIndex() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(4));
        Object[]arr = {new Integer(5),new Integer(6),new Integer(7), new Integer(8), new Integer(9)};
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.addAll(0, arr);

        Object[] expResult ={new Integer(5), new Integer(6), new Integer(7), new Integer(8), new Integer(9), new Integer(4)};

        // call tested method
        Object[] actualResult = immutableLinkedList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGet(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(new Integer(4));

        Object expResult = new Integer(3);

        // call tested method
        Object actualResult = immutableLinkedList4.get(2);

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemove(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(new Integer(4));

        Object[] expResult = {new Integer(2),new Integer(4)};

        // call tested method
        Object[] actualResult = immutableLinkedList4.remove(2).remove(0).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testSet(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(new Integer(4));

        Object[] expResult = {new Integer(10), new Integer(2),new Integer(4), new Integer(2)};

        // call tested method
        Object[] actualResult = immutableLinkedList4.set(0, new Integer(10)).set(2, new Integer(4)).set(3, new Integer(2)).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIndexOf(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));

        int expResult = 1;

        // call tested method
        int actualResult = immutableLinkedList3.indexOf(new Integer(2));

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));

        int expResult = 3;

        // call tested method
        int actualResult = immutableLinkedList3.size();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(2));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(3));

        Object [] expResult = {};

        // call tested method
        Object [] actualResult = immutableLinkedList3.clear().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));
        boolean expResult = false;

        // call tested method
        boolean actualResult = immutableLinkedList1.isEmpty();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testToArray(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1));

        Object []expResult = {new Integer(1)};

        // call tested method
        Object []actualResult = immutableLinkedList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testToString(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(5));
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(new Integer(6));
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(new Integer(7));
        String expResult = "5, 6, 7";

        // call tested method
        String actualResult = immutableLinkedList3.toString();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testAddFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object[] expResult = {new Integer(10), new Integer(1), new Integer(2), new Integer(3), new Integer(4)};

        // call tested method
        Object[] actualResult = immutableLinkedList1.addFirst(new Integer(10)).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object[] expResult = {new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(10)};

        // call tested method
        Object[] actualResult = immutableLinkedList1.addLast(new Integer(10)).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGetFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object expResult = new Integer(1);

        // call tested method
        Object actualResult = immutableLinkedList1.getFirst();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testGetLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object expResult = new Integer(4);

        // call tested method
        Object actualResult = immutableLinkedList1.getLast();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object [] expResult = {new Integer(2),new Integer(3),new Integer(4)};

        // call tested method
        Object [] actualResult = immutableLinkedList1.removeFirst().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(new Integer(1)).add(new Integer(2)).add(new Integer(3)).add(new Integer(4));

        Object [] expResult = {new Integer(1),new Integer(2),new Integer(3)};

        // call tested method
        Object [] actualResult = immutableLinkedList1.removeLast().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

}
