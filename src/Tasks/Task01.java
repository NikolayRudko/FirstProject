/*. Напишите программу, которая определит наибольшее из трех чисел A, B и C.
Числа A, B и C вводятся с клавиатуры. */

package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

    private int inputNum(String str) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.printf("Input %s number: %n", str);
                num = scanner.nextInt();
                return num;
            } catch (InputMismatchException e) {
                scanner.next();
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