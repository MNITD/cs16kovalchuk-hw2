package test.java.ua.edu.ucu.collections.immutable;

import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    private final Object[] testParams = {
            new Integer(0), new Integer(1), new Integer(2),
            new Integer(3), new Integer(4), new Integer(5),
            new Integer(6), new Integer(7), new Integer(8),
            new Integer(9), new Integer(10)
    };

    @Test
    public void testAdd() {
        // setup input data and expected result

        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[5]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[6]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[7]);
        Object[] expResult ={testParams[5],testParams[6],testParams[7]};

        // call tested method
        Object[] actualResult = immutableLinkedList3.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddByIndex() {
        // setup input data and expected result

        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object[]arr = {testParams[5],testParams[6],testParams[7]};
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.addAll(arr);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(1 ,testParams[8]);

        Object[] expResult ={testParams[5],testParams[8],testParams[6],testParams[7]};

        // call tested method
        Object[] actualResult = immutableLinkedList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object[]arr = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.addAll(arr);

        Object[] expResult ={testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};

        // call tested method
        Object[] actualResult = immutableLinkedList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllByIndex() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[4]);
        Object[]arr = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.addAll(0, arr);

        Object[] expResult ={testParams[5], testParams[6], testParams[7], testParams[8], testParams[9], testParams[4]};

        // call tested method
        Object[] actualResult = immutableLinkedList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGet(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(testParams[4]);
        Object expResult = testParams[3];

        // call tested method
        Object actualResult = immutableLinkedList4.get(2);

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemove(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(testParams[4]);

        Object[] expResult = {testParams[2],testParams[4]};

        // call tested method
        Object[] actualResult = immutableLinkedList4.remove(2).remove(0).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testSet(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);
        ImmutableLinkedList immutableLinkedList4 = immutableLinkedList3.add(testParams[4]);

        Object[] expResult = {testParams[10], testParams[2],testParams[4], testParams[2]};

        // call tested method
        Object[] actualResult = immutableLinkedList4
                .set(0, testParams[10])
                .set(2, testParams[4])
                .set(3, testParams[2]).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIndexOf(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);

        int expResult = 1;

        // call tested method
        int actualResult = immutableLinkedList3.indexOf(testParams[2]);

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);

        int expResult = 3;

        // call tested method
        int actualResult = immutableLinkedList3.size();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[2]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[3]);

        Object [] expResult = {};

        // call tested method
        Object [] actualResult = immutableLinkedList3.clear().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);
        boolean expResult = false;

        // call tested method
        boolean actualResult = immutableLinkedList1.isEmpty();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testToArray(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[1]);

        Object []expResult = {testParams[1]};

        // call tested method
        Object []actualResult = immutableLinkedList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testToString(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList.add(testParams[5]);
        ImmutableLinkedList immutableLinkedList2 = immutableLinkedList1.add(testParams[6]);
        ImmutableLinkedList immutableLinkedList3 = immutableLinkedList2.add(testParams[7]);
        String expResult = "5, 6, 7";

        // call tested method
        String actualResult = immutableLinkedList3.toString();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testAddFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);

        Object[] expResult = {testParams[10], testParams[1],testParams[2],testParams[3], testParams[4]};

        // call tested method
        Object[] actualResult = immutableLinkedList1.addFirst(testParams[10]).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);

        Object[] expResult = {testParams[1],testParams[2],testParams[3],testParams[4],testParams[10]};

        // call tested method
        Object[] actualResult = immutableLinkedList1.addLast(testParams[10]).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGetFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);

        Object expResult = testParams[1];

        // call tested method
        Object actualResult = immutableLinkedList1.getFirst();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testGetLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);

        Object expResult = testParams[4];

        // call tested method
        Object actualResult = immutableLinkedList1.getLast();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveFirst(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);

        Object [] expResult = {testParams[2],testParams[3],testParams[4]};

        // call tested method
        Object [] actualResult = immutableLinkedList1.removeFirst().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveLast(){
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        ImmutableLinkedList immutableLinkedList1 = immutableLinkedList
                .add(testParams[1]).add(testParams[2]).add(testParams[3]).add(testParams[4]);


        Object [] expResult = {testParams[1],testParams[2],testParams[3]};

        // call tested method
        Object [] actualResult = immutableLinkedList1.removeLast().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

}
