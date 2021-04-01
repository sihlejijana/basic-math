/**
* Author: Justin Jenecke 215163052
* Details: Test cases for maximum function
* Date: 01/04/2021
*/

package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTest {

    int arr[] = {5,4,88,20,101,6,27};
    int maximum = 0;

    int arr2[] = arr;

    @Test
    void equal() {

        for (int i = 0; i <arr.length ; i++){
            if (arr[i] > maximum)
                maximum = arr[i];
        }

        assertEquals(101, maximum);
    }

    @Test
    void same(){
        assertSame(arr2,arr);
    }

    @Test
    void fail() {

        for (int i = 0; i <arr.length ; i++){
            if (arr[i] > maximum)
                maximum = arr[i];
        }
            assertNotEquals(101, maximum);

    }

    @Test
    public void timeout() {
        assertTimeout(Duration.ofMillis(2000), () -> {
            Thread.sleep(1000);
            System.out.println(arr[4]);
        });
    }

    @Disabled("Disabled due to execution exceeding timeout")
    @Test
    public void timeoutTooLong() {

        assertTimeout(Duration.ofMillis(2000), () -> {
            Thread.sleep(1500);
            for(int i =0;i<5000;i++){
                System.out.println(i);
            }

        });
    }

}
