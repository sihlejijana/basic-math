package za.ac.cput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

   private Subtraction sub;



    @BeforeEach
    void setUp() {
        sub = new Subtraction();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIdentity(){


    }
    @Test
    void testEquality(){
        int result = sub.subtract(5,4);
        assertEquals(result,1);

    }
    @Test
    void FailingTest(){
        int result = sub.subtract(5,4);
        if (result ==1) System.out.println("test passed");
        else System.out.println("failed");
    }
}