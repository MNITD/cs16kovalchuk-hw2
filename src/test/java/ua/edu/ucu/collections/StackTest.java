package test.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private final Object[] testParams = {
            new Integer(0), new Integer(1), new Integer(2),
            new Integer(3), new Integer(4), new Integer(5)
    };

    @Test
    public void testPeek() {
        // setup input data and expected result
        Stack stack = new Stack();
        stack.push(testParams[1]);
        stack.push(testParams[2]);

        Object[] expResult = {testParams[2], testParams[2]};

        // call tested method
        Object[] actualResult = new Object[stack.getSize()];
        for(int i = 0; i < stack.getSize(); i++){
            actualResult[i] = stack.peek();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testPop() {
        // setup input data and expected result
        Stack stack = new Stack();
        stack.push(testParams[1]);
        stack.push(testParams[2]);

        Object[] expResult = {testParams[2], testParams[1]};

        // call tested method
        Object[] actualResult = new Object[stack.getSize()];

        int len = stack.getSize();
        for(int i = 0; i < len; i++){
            actualResult[i] = stack.pop();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testPush() {
        // setup input data and expected result
        Stack stack = new Stack();
        stack.push(testParams[1]);
        stack.push(testParams[2]);
        stack.push(testParams[3]);
        stack.push(testParams[4]);
        stack.push(testParams[5]);

        Object[] expResult = {testParams[5], testParams[4], testParams[3], testParams[2], testParams[1]};

        // call tested method
        Object[] actualResult = new Object[stack.getSize()];

        int len = stack.getSize();
        for(int i = 0; i < len; i++){
            actualResult[i] = stack.pop();
        }

        // compare expected result with actual result
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGetSize() {
        // setup input data and expected result
        Stack stack = new Stack();
        stack.push(testParams[1]);
        stack.push(testParams[2]);

        int expResult = 2;

        // call tested method
        int actualResult = stack.getSize();

        // compare expected result with actual result
        assertEquals(expResult, actualResult);
    }
    
}
