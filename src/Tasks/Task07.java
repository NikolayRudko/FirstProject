/*Напишите программу для вычисления матрицы B, которая будет представлять собой результат поворота матрицы A[nxn]
 на 90 градусов вправо. */

package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task07 {

    private int[][] originMatrix;

    //Input size array
/*    private void inputSize() {
        Scanner in = new Scanner(System.in);
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
    }*/

    private int inputNum() {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.println("Enter side %s. Enter only a positive integer.");
                num = scanner.nextInt();
                if (num <= 0)
                    throw new MyException("Number (" + num + ") is not positive integer.");
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

    //generate origin matrix
    private void generateMatrix() {
        int sizeMatrix = inputNum();
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
        int sizeMatrix =  originMatrix.length;
        int[][] rotateMatrix = new int[sizeMatrix][sizeMatrix];
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
