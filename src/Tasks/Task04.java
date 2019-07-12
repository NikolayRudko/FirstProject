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
            System.out.print("Input number factorial not more 16: ");
            while (!in.hasNextInt()) {
                System.out.println("That not a number!");
                in.next(); // this is important!
                System.out.print("Input number factorial not more 16: ");
            }
            num = in.nextInt();
        } while (num > 16);

        System.out.println(num);
        return num;
    }

    //Calculation of factorial
    public void factorialCalculation() {
        numberN = inputNum();
        if (numberN < 0)                            // If the user entered a negative number
        {
            factorialN = 0;                         // result 0
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        } else if (numberN == 0)                           // If the user entered a 0
        {
            factorialN = 1;                         // factorial 0 = 1
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        } else // In all other cases
        {
            factorialN = 1;
            for (int i = 1; i < numberN; i++)
                factorialN *= i;
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        }
    }
}