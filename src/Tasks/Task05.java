/*Решить следующую задачу: Вводится x. Найти остаток от деления функции f(x) на функцию g(x).
f(x) = ln x/(1/cos x+2,7𝑥);
g(x)=arcsin(x) + arccos(x)+ 𝑥2^1/2; */
package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task05 {

        private double inputNum() {
        Scanner scanner = new Scanner(System.in);
        double num;

        while (true) {
            try {
                System.out.println("Enter a number in the range from [0, 1).");
                num = scanner.nextInt();
                if (num <= 0 && num > 1)
                    throw new MyException("Number (" + num + ") s outside the calculated range.");
                return num;
            } catch (InputMismatchException|MyException e) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
                System.out.println("That’s not a valid double. Try again: ");
            }
        }
    }


    //The remainder of the division of functions
    public void division() {
        System.out.println("f(x) = ln(x/(1/cos(x+2,7*x)))");
        System.out.println("g(x) = arcsin(1/x)+arccos(x)+(2*x)^(1/2)");
        double numberX = inputNum();
        double resultFunctionF;
        double resultFunctionG;
        resultFunctionF = log(numberX / (1 / cos((numberX + 2.7 * numberX) * PI / 180)));    //result g(x)
        System.out.printf("f(x)= %.10f%n", resultFunctionF);
        resultFunctionG = asin(numberX) + acos(numberX) + sqrt(2 * numberX);                 //result f(x)
        System.out.printf("g(x)= %.10f%n", resultFunctionG);
        double remainderDivisionFunctions = resultFunctionF % resultFunctionG;
        System.out.printf("The remainder of the division of f(x)/g(x) = %.10f%n", remainderDivisionFunctions);
    }
}

