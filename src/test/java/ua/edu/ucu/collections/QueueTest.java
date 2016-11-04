package test.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private final Object[] testParams = {
            new Integer(0), new Integer(1), new Integer(2),
            new Integer(3), new Integer(4), new Integer(5)
    };

    @Test
    public void testPeek() {
        // setup input data and expected result
        Queue queue = new Queue();
        queue.enqueue(testParams[1]);
        queue.enqueue(testParams[2]);

        Object[] expResult = {testParams[1], testParams[1]};

        // call tested method
        Object[] actualResult = new Object[queue.getSize()];
        for(int i = 0; i < queue.getSize(); i++){
            actualResult[i] = queue.peek();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testDequeue() {
        // setup input data and expected result
        Queue queue = new Queue();
        queue.enqueue(testParams[1]);
        queue.enqueue(testParams[2]);

        Object[] expResult = {testParams[1], testParams[2]};

        // call tested method
        Object[] actualResult = new Object[queue.getSize()];
        int len = queue.getSize();
        for(int i = 0; i < len; i++){
            actualResult[i] = queue.dequeue();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testEnqueue() {
        // setup input data and expected result
        Queue queue = new Queue();
        queue.enqueue(testParams[1]);
        queue.enqueue(testParams[2]);
        queue.enqueue(testParams[3]);
        queue.enqueue(testParams[4]);
        queue.enqueue(testParams[5]);

        Object[] expResult = {testParams[1], testParams[2], testParams[3], testParams[4], testParams[5]};

        // call tested method
        Object[] actualResult = new Object[queue.getSize()];
        int len = queue.getSize();
        for(int i = 0; i < len; i++){
            actualResult[i] = queue.dequeue();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGetSize() {
        // setup input data and expected result
        Queue queue = new Queue();
        queue.enqueue(testParams[1]);
        queue.enqueue(testParams[2]);
        queue.enqueue(testParams[1]);
        queue.enqueue(testParams[2]);

        int expResult = 4;

        // call tested method
        int actualResult = queue.getSize();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }

}
