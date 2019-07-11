/*Найти n!, где n-заданное число (n!=1*2*3*…*n).*/
package Tasks;
import java.util.Scanner;

public class Task04 {
    Scanner in = new Scanner(System.in);
    private int numberN;
    private int factorialN;

    //Input and print input numberN
    private void inputNumber() {
        System.out.println("Input number factorial: ");
        numberN = in.nextInt();
    }

    //Calculation of factorial
    public void factorialCalculation() {
        inputNumber();
        if (numberN < 0)                            // If the user entered a negative number
        {
            factorialN = 0;                         // result 0
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        } else if (numberN == 0)                           // If the user entered a 0
        {
            factorialN = 1;                         // factorial 0 = 1
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        } else if (numberN < 16)                                    // In all other cases
        {
            factorialN = 1;
            for (int i = 1; i < numberN; i++)
                factorialN *= i;
            System.out.printf("Factorial number %d = %d", numberN, factorialN);
        } else
            System.out.println("Error type!!!");
    }
}
