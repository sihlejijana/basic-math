package za.ac.cput;

import java.util.*;
public class Multiplication
{

    //testing method
    public int multiply (int x, int y)
    {
        return x * y;
    }




    //Actual calculation method for end users
    public void Multiply()
    {
        Scanner input = new Scanner(System.in);
        int x, y, answer;

        System.out.println("Please input the first number you would like to multiply: ");
        x = input.nextInt();

        System.out.println("Please input the second number you would like to multiply: ");
        y = input.nextInt();

        answer = x * y;
        System.out.println("The answer is " + answer);


    }



}
