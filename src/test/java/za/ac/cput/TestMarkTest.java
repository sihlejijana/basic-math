package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.BeforeEach;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;



class TestMarkTest {

private int Mark1;
private int Mark2;
private int Mark3;


@BeforeEach
    void setUp()
    {
      Mark1 = 50;
      Mark2 = 75;
      Mark3 = 50;
      Mark1 = Mark3;
    }

    @Test
    void testIdentity()

    {
     assertSame(Mark1 , Mark2);
     assertNotSame(Mark1 ,Mark3);
    }



    @Test
    void testEquality()
    {
    assertEquals(Mark1, Mark2);
    assertNotEquals(Mark2,Mark2);
    }

    @Test
    @Timeout(value = 50 , unit = TimeUnit.MILLISECONDS)
    void timeOut() throws InterruptedException {
      Thread.sleep(100);
        System.out.println("Time Exceeded");
    }

   @Test
   void  failed()
   {
    fail("failed : Mark1 is not the same as Mark2");
    assertSame(Mark1 , Mark2);
   }



    @Test
    @Disabled
    void  disableMark(){
        Mark1 = Mark3;
    }

}