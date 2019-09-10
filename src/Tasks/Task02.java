/* Даны 3 числа, являющиеся длинами сторон треугольника.
Определить тип треугольника (равнобедренный, равносторонний, разносторонний).*/

package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {

    private int inputNum(String str) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.printf("Enter side %s. Enter only a positive integer.\n", str);
                num = scanner.nextInt();
                if (num <= 0)
                    throw new MyException("Number (" + num + ") is not positive integer.");
                return num;
            } catch (InputMismatchException  | MyException e ) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
                System.out.println("That’s not a positive integer. Try again: ");
            }
        }
    }

    //Triangle type definition
    public void triangleType() {
        int sideA = inputNum("A");
        int sideB = inputNum("B");
        int sideC = inputNum("C");
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA)
            System.out.println("This triangle does not exist!!!");
        else if (sideA == sideB && sideA == sideC)
            System.out.println("This triangle is equilateral");
        else if (sideA == sideB || sideB == sideC || sideC == sideA)
            System.out.println("This triangle is isosceles");
        else
            System.out.println("This triangle is versatile");
    }
}

