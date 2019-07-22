/*Дана прямоугольная матрица. Определить количество особых элементов массива,
считая его элемент особым, если он больше суммы остальных элементов его столбца. */

package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    Scanner in = new Scanner(System.in);

    private int rows;
    private int columns;
    private int[][] matrix;
    private int[] summRows;
    private int specialElements = 0;

    //Input numbers
    private void inputNumber() {
        rows = inputInt("Input rows: ");
        columns = inputInt("Input columns: ");
        System.out.println("Rows = ");
        System.out.println("Columns = ");
    }

    //Input positive number
    private int inputInt(String str) {
        int number;
        do {
            System.out.println(str);
            while (!in.hasNextInt()) {
                System.out.println("Error! There is no INTEGER number!");
                in.next();
            }

            number = in.nextInt();

            if (number <= 0)
                System.out.println("Invalid data! Input a numbers greater than zero!");
        } while (number <= 0);
        return number;
    }

    //generate array
    private void generateMatrix() {
        inputNumber();
        matrix = new int[rows][columns];
        System.out.println("Generate matrix: ");
        //Create an object to generate numbers
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random rnd = new Random();
        //Generate random array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Get a random number (ranging from 0 to 10)
                matrix[i][j] = rnd.nextInt(diff + 1);
                System.out.printf(" [%d]=%4d", i, matrix[i][j]);
            }
            System.out.println();
        }
    }

    //Search special elements
    public void searchSpecialElements() {
        generateMatrix();
        summRows = new int[rows];

        //line sum calculation
        for (int i = 0; i < rows; i++) {
            summRows[i] = 0;
            for (int j = 0; j < columns; j++)
                summRows[i] += matrix[i][j];
        }

        //Search special elements
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                if (matrix[i][j] > (summRows[i] - matrix[i][j]))
                    specialElements++;
        System.out.printf("quantity special elements: %d", specialElements);
    }
}