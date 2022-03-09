import org.example.fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
    * Test cases:
    * fibonacci 1 -> *
    * fibonacci 2-> *
    * fibonacci 3-> represents all the values greater than 2 and smaller than 50 *
    * fibonacci 50-> raises an exception *
    * fibonnaci negative number-> raises an exception *
 */

public class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    public void setUp(){fibonacci = new Fibonacci();}
    public void finish(){fibonacci = null;}

    @Test
    public void testCompute1Return0(){
        int expectedValue=0;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void testCompute2Return1(){
        int expectedValue=1;
        int obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void testCompute3Return1(){
        int expectedValue=1;
        int obtainedValue = fibonacci.compute(3);
        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void testCompute4Return2(){
        int expectedValue=2;
        int obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void testComputeOfANumberLittleThan0RaiseException(){
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    public void testComputeOfANumberGreaterThan50RaiseException(){
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(52));
    }

}
