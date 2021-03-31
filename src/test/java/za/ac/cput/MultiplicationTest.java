package za.ac.cput;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest{




    private Multiplication number1;
    private Multiplication number2;




    @BeforeEach
    void setUp() {
        number1 = new Multiplication();
        number2 = new Multiplication();

    }

    @Test
    void testIdentity(){
        assertSame(number1,number1);

    }

    @Test
    void testEquality(){
        assertEquals(number1, number1);

    }

    @Test
    void failTest(){
        assertEquals(number1,number2);

    }

    @Test
    void timeoutTest(){


    }






}