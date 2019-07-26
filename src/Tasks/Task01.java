/*. Напишите программу, которая определит наибольшее из трех чисел A, B и C.
Числа A, B и C вводятся с клавиатуры. */

package Tasks;

import java.util.Scanner;

public class Task01 {
    Scanner in = new Scanner(System.in);

    private int numA;
    private int numB;
    private int numC;

    private int inputNum(String str) {
        int num;
        System.out.print("Input " + str + " number: ");

        while (!in.hasNextInt()) {
            System.out.println("That not a number!");
            in.next(); // this is important!
            System.out.print("Input " + str + " number: ");
        }
        num = in.nextInt();

        System.out.printf("%s = %d%n", str, num);
        return num;
    }

    //Search max numbers
    public void maxNumber() {
        numA = inputNum("A");
        numB = inputNum("B");
        numC = inputNum("C");
        if (numA == numB && numB == numC)
            System.out.println("All numbers are equal!");
        else if (numA == numB && numA > numC)
            System.out.println("Numbers A and B are equal and greatest!");
        else if (numC == numB && numC > numA)
            System.out.println("Numbers B and C are equal and greatest!");
        else if (numA == numC && numA > numB)
            System.out.println("Numbers A and B are equal and greatest!");
        else if (numA > numB && numA > numC)
            System.out.printf("Number A = %d is the greatest %n", numA);
        else if (numB >= numA & numB >= numC)
            System.out.printf("Number B = %d is the greatest %n", numB);
        else
            System.out.printf("Number C = %d is the greatest %n", numC);
    }
}