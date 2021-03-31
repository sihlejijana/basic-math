package za.ac.cput;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest{




    private Multiplication multiple1;




    @BeforeEach
    public void setUp(){
        this.multiple1 = new Multiplication();

    }


    @Test
    void testIdentity(){
        int answer = multiple1.multiplication(4,2);
        assertSame(answer,answer);

    }

    @Test
    void testEquality(){
        int answer = multiple1.multiplication(4,2);
        assertEquals(answer, 8);

    }

    @Test
    void failTest(){
        int answer = multiple1.multiplication(4,2);
        assertEquals(answer,20);

    }

    @Test
    void timeoutTest(){



    }






}