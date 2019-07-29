/*Решить следующую задачу: Вводится x. Найти остаток от деления функции f(x) на функцию g(x).
f(x) = ln x/(1/cos x+2,7𝑥);
g(x)=arcsin(x) + arccos(x)+ 𝑥2^1/2; */
package Tasks;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task05 {
    Scanner in = new Scanner(System.in);

    private double numberX;
    private double remainderDivisionFunctions;

    //Input and print input numberX
    private double inputNum() {
        double num;
        System.out.println("f(x) = ln(x/(1/cos(x+2,7*x)))");
        System.out.println("g(x) = arcsin(1/x)+arccos(x)+(2*x)^(1/2)");
        do {
            System.out.print("Input number X (0<X<=1):");
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next(); // this is important!
            }
            num = in.nextDouble();
            if (num <= 0 && num > 1)
                System.out.print("Input number X (0<X<=1):");
        } while (num <= 0 && num > 1);

        System.out.println(num);
        return num;
    }

    //The remainder of the division of functions
    public void division() {
        numberX = inputNum();
        double resultFunctionF;
        double resultFunctionG;
        resultFunctionF = log(numberX / (1 / cos((numberX + 2.7 * numberX) * PI / 180)));    //result g(x)
        System.out.printf("f(x)= %.10f%n", resultFunctionF);
        resultFunctionG = asin(numberX) + acos(numberX) + sqrt(2 * numberX);                 //result f(x)
        System.out.printf("g(x)= %.10f%n", resultFunctionG);
        remainderDivisionFunctions = resultFunctionF % resultFunctionG;
        System.out.printf("The remainder of the division of f(x)/g(x) = %.10f%n", remainderDivisionFunctions);
    }
}

