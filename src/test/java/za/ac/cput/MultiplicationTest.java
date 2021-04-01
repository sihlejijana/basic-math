package za.ac.cput;

/**
 * Author KM Karelse (219000859)
 * Date: 01/04/2021
 *
 * This tests multiplications
 */

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest{


    private Multiplication multiple1;




    @BeforeEach
    public void setUp(){
        this.multiple1 = new Multiplication();

    }



    //Testing object identity
    @Test
    void testIdentity(){
        int answer = multiple1.multiply(4,2);
        assertSame(answer,answer);

    }

    //Testing object Equality
    @Test
    void testEquality(){
        int answer = multiple1.multiply(4,2);
        assertEquals(8, answer);

    }


    //Disables a Test, resulting in it being skipped while testing.
    @Disabled
    @Test
    void disabledTest(){
        int answer = multiple1.multiply(5,3);
        assertEquals(34,answer);
    }


    //Deliberately fails a test
    @Test
    void failTest(){
        int answer = multiple1.multiply(4,2);
        assertEquals(20,answer);

    }



    //Timeout where execution cannot exceed 3 seconds
    @Timeout(3)
    @Test
    void testTimeout(){
        int answer = multiple1.multiply(4,2);
        assertEquals(8, answer);

    }


}