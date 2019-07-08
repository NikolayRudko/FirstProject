/* Даны 3 числа, являющиеся длинами сторон треугольника.
Определить тип треугольника (равнобедренный, равносторонний, разносторонний).*/

import java.util.Scanner;

public class Task02 {
    Scanner in = new Scanner(System.in);

    private int sideA;
    private int sideB;
    private int sideC;

    //Input numbers
    private void input() {
        sideA = inputInt("Input A side: ");
        sideB = inputInt("Input B side: ");
        sideC = inputInt("Input C side: ");
        print();
    }

    //Print numbers
    private void print() {
        System.out.printf("Side A = %d%n", sideA);
        System.out.printf("Side B = %d%n", sideB);
        System.out.printf("Side C = %d%n", sideC);
    }

    //Input positive numbers
    private int inputInt(String str) {
        int number;
        do {
            System.out.println(str);
            number = in.nextInt();
        } while (number <= 0);
        return number;
    }

    //Triangle type definition
    public void triangleType() {
        input();
        if (sideA == sideB && sideA == sideC)
            System.out.println("This triangle is equilateral");
        else if (sideA == sideB || sideB == sideC || sideC == sideA)
            System.out.println("This triangle is isosceles");
        else
            System.out.println("This triangle is versatile");
    }
}

