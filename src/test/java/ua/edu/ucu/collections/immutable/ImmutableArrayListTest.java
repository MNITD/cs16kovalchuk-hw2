package test.java.ua.edu.ucu.collections.immutable;

import main.java.ua.edu.ucu.collections.immutable.ImmutableArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    private final Object[] testParams = {
            new Integer(0), new Integer(1), new Integer(2),
            new Integer(3), new Integer(4), new Integer(5),
            new Integer(6), new Integer(7), new Integer(8),
            new Integer(9), new Integer(10)
    };

    @Test
    public void testAdd() {
        // setup input data and expected result

        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[4]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[5]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[6]);
        Object[] expResult = {testParams[4], testParams[5], testParams[6]};

        // call tested method
        Object[] actualResult = immutableArrayList3.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddByIndex() {
        // setup input data and expected result

        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        Object[] arr = {testParams[4], testParams[5], testParams[6]};
        ImmutableArrayList immutableArrayList1 = immutableArrayList.addAll(arr);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(1, testParams[7]);

        Object[] expResult = {testParams[4], testParams[7], testParams[5], testParams[6]};

        // call tested method
        Object[] actualResult = immutableArrayList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        Object[] arr = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};
        ImmutableArrayList immutableArrayList1 = immutableArrayList.addAll(arr);

        Object[] expResult = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};

        // call tested method
        Object[] actualResult = immutableArrayList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllByIndex() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[4]);
        Object[] arr = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9]};
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.addAll(0, arr);

        Object[] expResult = {testParams[5], testParams[6], testParams[7], testParams[8], testParams[9], testParams[4]};

        // call tested method
        Object[] actualResult = immutableArrayList2.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGet() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);
        ImmutableArrayList immutableArrayList4 = immutableArrayList3.add(testParams[4]);

        Object expResult = testParams[3];

        // call tested method
        Object actualResult = immutableArrayList4.get(2);

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemove() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);
        ImmutableArrayList immutableArrayList4 = immutableArrayList3.add(testParams[4]);

        Object[] expResult = {testParams[2], testParams[4]};

        // call tested method
        Object[] actualResult = immutableArrayList4.remove(2).remove(0).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testSet() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);
        ImmutableArrayList immutableArrayList4 = immutableArrayList3.add(testParams[4]);

        Object[] expResult = {testParams[10], testParams[2], testParams[4], testParams[2]};

        // call tested method
        Object[] actualResult = immutableArrayList4
                .set(0, testParams[10])
                .set(2, testParams[4])
                .set(3, testParams[2]).toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIndexOf() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);
        int expResult = 1;

        // call tested method
        int actualResult = immutableArrayList3.indexOf(testParams[2]);

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);

        int expResult = 3;

        // call tested method
        int actualResult = immutableArrayList3.size();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[2]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[3]);

        Object[] expResult = {};

        // call tested method
        Object[] actualResult = immutableArrayList3.clear().toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);
        boolean expResult = false;

        // call tested method
        boolean actualResult = immutableArrayList1.isEmpty();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testToArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[1]);

        Object[] expResult = {testParams[1]};

        // call tested method
        Object[] actualResult = immutableArrayList1.toArray();

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testToString() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList immutableArrayList1 = immutableArrayList.add(testParams[5]);
        ImmutableArrayList immutableArrayList2 = immutableArrayList1.add(testParams[6]);
        ImmutableArrayList immutableArrayList3 = immutableArrayList2.add(testParams[7]);
        String expResult = "5, 6, 7";

        // call tested method
        String actualResult = immutableArrayList3.toString();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }


}
