package za.ac.cput;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;

import static org.junit.jupiter.api.Assertions.*;
class SubtractionTest {

   private Subtraction sub;

    public int num;
    public int num2;


    @BeforeEach
    void setUp() {
        sub = new Subtraction();
        num = num2;

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIdentity(){

        assertSame(num,num2);

    }
    @Test
    void testEquality(){
        int result = sub.subtract(5,4);
        assertEquals(result,1);

    }
    @Test
    void FailingTest(){
        int result = sub.subtract(10,4);
        assertEquals(result,1);
    }

    @Test
    void timeoutNotExceeded()
    {
        //The following assertion succeeds.
        assertTimeout(ofMinutes(2), () -> {
            // Perform task that takes less than 2 minutes.
        });
    }
    @Disabled
    @Test
    void timeoutExceeded()
    {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }


}