package za.ac.cput;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest{




    private Multiplication multiple1;
    private Multiplication multiple2;




    @BeforeEach
    void setUp() {
        multiple1 = new Multiplication();
        multiple2 = new Multiplication();

    }

    @Test
    void testIdentity(){
        assertSame(multiple1,multiple1);

    }

    @Test
    void testEquality(){
        assertEquals(multiple1, multiple1);

    }

    @Test
    void failTest(){
        assertEquals(multiple1,multiple2);

    }

    @Test
    void timeoutTest(){


    }






}