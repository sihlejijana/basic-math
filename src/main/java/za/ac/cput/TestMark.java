package za.ac.cput;

/**
 * Author
 * Name:Themba Khanyile
 * StudentNumber:217238173
 *
 *
 * The following program calculates the mean TestMark Among Students who wrote a test ot of 100
 */
public class TestMark 
{
    public static void main(String args[])
     {

        float mean;
        int sum , i;
        int n = 5;
        int Mark1 = 50;
        int Mark2 = 50;
        int Mark3 = 50;
        sum = 0;
        for (i=0; i< n;i++){
            sum+=(Mark1 + Mark2 + Mark3);
        }
        System.out.println("mean is" + sum/(float)n);
    }
}
