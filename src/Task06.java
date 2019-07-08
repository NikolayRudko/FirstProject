/*Замените все отрицательные элементы одномерного массива на индекс,
занимаемый данным элементом. Элементы массива вводятся с клавиатуры,
или задаются случайным образом.*/

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    Scanner in = new Scanner(System.in);
    private int sizeArray;
    private int[] randomArray;

    //Input size array
    private void inputNumber() {
        do {
            System.out.println("Input size array:");
            ;
            sizeArray = in.nextInt();
        } while (sizeArray < 0);
        System.out.printf("Size array = %d%n", sizeArray);
    }

    //generate array
    private void generateArray() {
        inputNumber();
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
