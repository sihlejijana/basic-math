package za.ac.cput.simplemath;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    private int x;
    private int y;
    private int z;

    @BeforeEach
    void setUp() {
        x = 10;
        y = 12;
        z = x;
    }

    //Object Equality
    @Test
    void testEquality() {
        Addition x = new Addition();
        Addition y = new Addition();
        Addition z = x;
        assertEquals(x, z);
    }

    //Object Identity
    @Test
    void testIdentity() {
        Addition x = new Addition();
        Addition y = new Addition();
        Addition z = x;
        assertSame(x, z);
    }

    //Failing test
    @Test
    void testAddition() {
        Addition addition = new Addition();
        int a = 11;
        int b = 9;
        int expectedResult = 22;
        int result = addition.add(a, b);
        assertEquals(expectedResult, result);
    }

    //Timeout
    @Test
    @Timeout(1)
    void testTimeoutNotExceeded() {

            System.out.println("Timeout not exceeded");
            Addition addition = new Addition();
            int a = 5;
            int b = 4;
            int expectedResult = 9;
            int result = addition.add(a,b);
            assertEquals(expectedResult, result);
    }

    //Disabling a test
        @Disabled
        @Test
        void temporarilyDisabledTest() {
            Addition addition = new Addition();
            int a = 11;
            int b = 9;
            assertEquals(20, 6 + 14);
        }

        @Test
        void testAdd() {
            assertEquals(5, 2 + 3);
        }
    }
