package za.ac.cput.simplemath;

import java.util.Scanner;

/**
 * @author Sihle Jijana
 * @stdno: 216273919
 * This is a small simple math program of addition
 */
public class Addition {

    public static void main(String[] args) {

        int x, y, z;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        x = kbd.nextInt();

        System.out.println("Please enter another integer: ");
        y = kbd.nextInt();

        z = add(x,y);
        System.out.println("Numbers added together is: " + x + "+" + y + "=" + z);

    }
        static int add(int a, int b)
        {
         return a+b;
        }
    }
