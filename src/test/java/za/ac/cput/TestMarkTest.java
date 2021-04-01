package za.ac.cput;

/**
 * Author
 *  * Name:Themba Khanyile
 *  * StudentNumber:217238173
 *  *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;



class TestMarkTest {

private TestMark Mark1;
private TestMark Mark2;
private TestMark Mark3;


@BeforeEach
    void setUp()
    {
        
      Mark1 = new TestMark();
      Mark2 = new TestMark();
      Mark3 = new TestMark();
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