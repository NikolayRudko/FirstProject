/*Дана прямоугольная матрица. Определить количество особых элементов массива,
считая его элемент особым, если он больше суммы остальных элементов его столбца. */

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    Scanner in = new Scanner(System.in);

    private int rows;
    private int colums;
    private int[][] matrix;
    private int[] summRows;
    private int specialElements = 0;

    //Input numbers
    private void inputNumber() {
        rows = inputInt("Input rows: ");
        colums = inputInt("Input colums: ");
        System.out.println("Rows = ");
        System.out.println("Colums = ");
    }

    //Input positive number
    private int inputInt(String str) {
        int number;
        do {
            System.out.println(str);
            number = in.nextInt();
        } while (number < 0);
        return number;
    }

    //generate array
    private void generateMatrix() {
        inputNumber();
        matrix = new int[rows][colums];
        System.out.println("Generate matrix: ");
        //Create an object to generate numbers
        int min = 0;
        int max = 10;
        int diff = max - min;
        Random rnd = new Random();
        //Generate random array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                matrix[i][j] = rnd.nextInt(diff + 1);               // Get a random number (ranging from 0 to 10)
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
            for (int j = 0; j < colums; j++) {
                summRows[i] += matrix[i][j];
            }
        }

        //Search special elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (matrix[i][j] > (summRows[i] - matrix[i][j])) {
                    specialElements++;
                }
            }
        }
        System.out.printf("quantity special elements: %d", specialElements);
    }
}