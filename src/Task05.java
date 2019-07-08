/*Решить следующую задачу: Вводится x. Найти остаток от деления функции f(x) на функцию g(x).
f(x) = ln x/(1/cos x+2,7𝑥);
g(x)=arcsin(x) + arccos(x)+ 𝑥2^1/2; */

import java.util.Scanner;

public class Task05 {
    Scanner in = new Scanner(System.in);

    private double numberX;
    private double remainderDivisionFunctions;

    //Input and print input numberX
    private void inputNumber() {
        System.out.println("f(x) = ln(x/(1/cos(x+2,7*x)))");
        System.out.println("g(x) = arcsin(1/x)+arccos(x)+(2*x)^(1/2)");
        do {
            System.out.println("Input number X (0<X<=1):");
            numberX = in.nextDouble();
        } while (numberX > 1 || numberX <= 0);
        System.out.printf("X = %.10f", numberX);
    }

    //The remainder of the division of functions
    public void division() {
        inputNumber();
        double resultFunctionF;
        double resultFunctionG;
        resultFunctionF = Math.log(numberX / (1 / Math.cos((numberX + 2.7 * numberX) * Math.PI / 180)));    //result g(x)
        System.out.printf("f(x)= %.10f%n", resultFunctionF);
        resultFunctionG = Math.asin(numberX) + Math.acos(numberX) + Math.sqrt(2 * numberX);                 //result f(x)
        System.out.printf("g(x)= %.10f%n", resultFunctionG);
        remainderDivisionFunctions = resultFunctionF % resultFunctionG;
        System.out.printf("The remainder of the division of f(x)/g(x) = %.10f%n", remainderDivisionFunctions);
    }
}

