/*Найти n!, где n-заданное число (n!=1*2*3*…*n).*/
package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task04 {

/*    private int inputNum() {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.print("Input positive integer number factorial not more 16: ");
            while (!in.hasNextInt()) {
                System.out.println("That not a number!");
                in.next(); // this is important!
            }
            num = in.nextInt();

            if (num > 16 || num < 0)
                System.out.print("Input positive number factorial not more 16: ");

        } while (num > 16 || num < 0);
        System.out.println(num);
        return num;
    }*/

    private int inputNum() {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.println("Enter a number in the range from [1, 16].");
                num = scanner.nextInt();
                if (num > 16 || num < 0)
                    throw new MyException("The factorial of the number (" + num + ") goes beyond the type integer.");
                return num;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Exception: " + e);
                System.out.println("That’s not an integer. Try again: ");
            } catch (MyException e) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
            }
        }
    }


    //Calculation of factorial
    public void factorialCalculation() {
        int numberN = inputNum();
        int factorialN = calculationCycle(numberN);
        System.out.printf("Factorial number %d = %d%n", numberN, factorialN);
        factorialN = calculateRecursion(numberN);
        System.out.printf("Factorial number %d = %d%n", numberN, factorialN);
    }

    private int calculationCycle(int num) {
        int fact;
        // If the user entered a 0 ,factorial 0 = 1
        if (num == 0) {
            return 1;
        }
        // In all other cases
        fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    //Recursion version
    private int calculateRecursion(int num) {
        if (num == 0) return 1;
        return calculateRecursion(num - 1) * num;
    }
}
