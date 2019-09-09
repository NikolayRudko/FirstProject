/*Замените все отрицательные элементы одномерного массива на индекс,
занимаемый данным элементом. Элементы массива вводятся с клавиатуры,
или задаются случайным образом.*/
package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task06 {

    private int sizeArray;
    private int[] randomArray;

/*    //Input size array
    private void inputNumber() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Input size array:");
            while (!in.hasNextInt()) {
                System.out.println("Error! There is no INTEGER number!");
                in.next();
            }

            sizeArray = in.nextInt();

            if (sizeArray <= 0)
                System.out.println("Invalid data! Input a numbers greater than zero!");
        }
        while (sizeArray <= 0);
        System.out.printf("Size array = %d%n", sizeArray);
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

    //generate array
    private void generateArray() {
        int sizeArray = inputNum();
        randomArray = new int[sizeArray];
        System.out.println("Source array: ");
        // Create an object to generate numbers
        int min = -100;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        //generate random array
        for (int i = 0; i < sizeArray; i++) {
            randomArray[i] = random.nextInt(diff + 1);
            randomArray[i] += min;// Get a random number (ranging from 0 to 10)
            System.out.printf(" [%d]=%4d", i, randomArray[i]);
        }
        System.out.println();
    }

    //Replacing negative items
    public void replacingNegativeItems() {
        generateArray();
        System.out.println("Modified array: ");
        for (int i = 0; i < sizeArray; i++) {
            //Replacing negative items
            if (randomArray[i] < 0)
                randomArray[i] = i;
            System.out.printf(" [%d]=%4d", i, randomArray[i]);
        }
    }
}
