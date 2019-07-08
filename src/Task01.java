/*. Напишите программу, которая определит наибольшее из трех чисел A, B и C.
Числа A, B и C вводятся с клавиатуры. */

import java.util.Scanner;

public class Task01 {
    Scanner in = new Scanner(System.in);

    private int numA;
    private int numB;
    private int numC;

    //Input numbers
    private void input() {
        System.out.print("Input A number: ");
        numA = in.nextInt();
        System.out.print("Input B number: ");
        numB = in.nextInt();
        System.out.print("Input C number: ");
        numC = in.nextInt();
        print();
    }

    //Print numbers
    private void print() {
        System.out.printf("A = %d%n", numA);
        System.out.printf("B = %d%n", numB);
        System.out.printf("C = %d%n", numC);
    }

    //Search max numbers
    public void maxNumber() {
        input();
        if (numA == numB && numB == numC)
            System.out.println("All numbers are equal!");
        else if (numA == numB && numA > numC)
            System.out.println("Numbers A and B equal and greatest!");
        else if (numC == numB && numC > numA)
            System.out.println("Numbers B and C equal and greatest!");
        else if (numA == numC && numA > numB)
            System.out.println("Numbers A and B equal and greatest!");
        else if (numA > numB && numA > numC)
            System.out.printf("Number A = %d is greatest %n", numA);
        else if (numB >= numA & numB >= numC)
            System.out.printf("Number B = %d is greatest %n", numB);
        else
            System.out.printf("Number C = %d is greatest %n", numC);
    }
}
