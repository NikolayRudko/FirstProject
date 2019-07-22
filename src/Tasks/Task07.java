/*Напишите программу для вычисления матрицы B, которая будет представлять собой результат поворота матрицы A[nxn]
 на 90 градусов вправо. */

package Tasks;

import java.util.Scanner;

public class Task07 {
    Scanner in = new Scanner(System.in);

    private int sizeMatrix;
    private int[][] originMatrix;
    private int[][] rotateMatrix;

    //Input size array
    private void inputSize() {
        do {
            System.out.println("Input size array:");
            while (!in.hasNextInt()) {
                System.out.println("Error! There is no INTEGER number!");
                in.next();
                System.out.println("There is no INTEGER number!");
            }

            sizeMatrix = in.nextInt();

            if (sizeMatrix <= 0)
                System.out.println("Invalid data! Input a numbers greater than zero!");
        }
        while (sizeMatrix <= 0);
        System.out.printf("Size array = %d%n", sizeMatrix);
    }

    //generate origin matrix
    private void generateMatrix() {
        inputSize();
        originMatrix = new int[sizeMatrix][sizeMatrix];
        System.out.println("Origin matrix: ");
        for (int i = 0; i < sizeMatrix; i++) {
            //generate random array
            for (int j = 0; j < sizeMatrix; j++) {
                originMatrix[i][j] = (i + 1) * 10 + j + 1;
                System.out.printf("%4d", originMatrix[i][j]);
            }
            System.out.println();
        }
    }

    //rotate matrix
    public void rotateOriginMatrix() {
        generateMatrix();
        rotateMatrix = new int[sizeMatrix][sizeMatrix];
        System.out.println("Rotate matrix: ");
        int k;
        //create rotate array
        for (int i = 0; i < sizeMatrix; i++)
            for (int j = 0; j < sizeMatrix; j++) {
                k = (sizeMatrix - 1) - j;
                rotateMatrix[i][j] = originMatrix[k][i];
            }

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++)
                System.out.printf("%4d", rotateMatrix[i][j]);
            System.out.println();
        }
    }
}
