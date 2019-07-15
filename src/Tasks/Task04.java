/*Найти n!, где n-заданное число (n!=1*2*3*…*n).*/
package Tasks;

import java.util.Scanner;

public class Task04 {
    Scanner in = new Scanner(System.in);
    private int numberN;
    private int factorialN;

    private int inputNum() {
        int num;
        do {
            System.out.print("Input positive integer number factorial not more 16: ");
            while (!in.hasNextInt()) {
                System.out.println("That not a number!");
                in.next(); // this is important!
                System.out.print("Input number factorial not more 16: ");
            }
            num = in.nextInt();
        } while (num > 16 || num < 0);
        System.out.println(num);
        return num;
    }

    //Calculation of factorial
    public void factorialCalculation() {
        numberN = inputNum();
        factorialN = calculationCycle(numberN);
        System.out.printf("Factorial number %d = %d%n", numberN, factorialN);
        factorialN = calculateRecursion(numberN);
        System.out.printf("Factorial number %d = %d%n", numberN, factorialN);
    }

    private int calculationCycle(int num) {
        int fact;
        if (num == 0)                           // If the user entered a 0
            return 1;                         // factorial 0 = 1
        else // In all other cases
        {
            fact = 1;
            for (int i = 1; i <= num; i++)
                fact *= i;
            return fact;
        }
    }

    //Recursion version
    private int calculateRecursion(int num) {
        if (num == 0) return 1;
        return calculateRecursion(num - 1) * num;
    }
}
