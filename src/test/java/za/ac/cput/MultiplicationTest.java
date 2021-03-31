package za.ac.cput;


import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest{


    private Multiplication multiple1;
    private Multiplication multiplyTest = new Multiplication();



    @BeforeEach
    public void setUp(){
        this.multiple1 = new Multiplication();

    }



    //Testing object identity
    @Test
    void testIdentity(){
        int answer = multiple1.multiplication(4,2);
        assertSame(answer,answer);

    }

    //Testing object Equality
    @Test
    void testEquality(){
        int answer = multiple1.multiplication(4,2);
        assertEquals(answer, 8);

    }


    //Disables a Test
    @Disabled
    void disabledTest(){
        int answer = multiple1.multiplication(5,3);
        assertEquals(answer,15);
    }


    //Deliberately fails a test
    @Test
    void failTest(){
        int answer = multiple1.multiplication(4,2);
        assertEquals(answer,20);

    }



    //Timeout where execution cannot exceed 3 seconds
    @Test
    @Timeout(3)
    void testTimeout(){
        int answer = multiple1.multiplication(4,2);
        assertEquals(answer, 8);

    }


}