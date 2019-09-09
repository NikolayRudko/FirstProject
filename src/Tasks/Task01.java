/*. Напишите программу, которая определит наибольшее из трех чисел A, B и C.
Числа A, B и C вводятся с клавиатуры. */

package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

    private int inputNum(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Enter integer number %s:\n", str);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
                System.out.println("That’s not an integer. Try again: ");
            }
        }
    }

    //Search max numbers
    public void maxNumber() {
        int numA = inputNum("A");
        int numB = inputNum("B");
        int numC = inputNum("C");
        if (numA == numB && numB == numC)
            System.out.println("All numbers are equal!");
        else if (numA == numB && numA > numC)
            System.out.printf("Numbers A = %d and B = %d are equal and greatest than C = %d!\n", numA, numB, numC);
        else if (numC == numB && numC > numA)
            System.out.printf("Numbers B = %d and C = %d are equal and greatest than A = %d!\n", numB, numC, numA);
        else if (numA == numC && numA > numB)
            System.out.printf("Numbers A = %d and C = %d equal and greatest than B = %d!\n", numA, numC, numB);
        else if (numA > numB && numA > numC)
            System.out.printf("Number A = %d is greatest!\n", numA);
        else if (numB >= numA & numB >= numC)
            System.out.printf("Number B = %d is greatest!\n", numB);
        else
            System.out.printf("Number C = %d is greatest!\n", numC);
    }
}