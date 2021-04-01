package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
//import static java.time.Duration.ofMinutes;
//import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.BeforeEach;

//import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled("Do not run Environment Below")
class TestMarkTest {

public int Mark1;
public int Mark2;
public int Mark3;

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

   // @Test
   // void timeoutNotExceeded()
  //  {
        //asserTimeout passes
  //      assertTimeout(ofMinutes(1), () ->{

  //  });
   // }



   // @Test
   // void timeoutExceeds()
   // {
        //asserTimeot fails
  //      assertTimeout(ofMillis(5), () ->
   //     {

    //        Thread.sleep(100);

  //  });
  //  }

}