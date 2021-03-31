package za.ac.cput;

import java.util.*;
public class Multiplication
{
    Scanner input = new Scanner(System.in);
    public int x, y, answer;



    public void Multiply()
    {
        System.out.println("Please input the first number you would like to multiply: ");
        x = input.nextInt();

        System.out.println("Please input the second number you would like to multiply: ");
        y = input.nextInt();

        answer = x * y;
        System.out.println("The answer is " + answer);


    }



}
