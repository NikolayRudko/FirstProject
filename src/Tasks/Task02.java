/* Даны 3 числа, являющиеся длинами сторон треугольника.
Определить тип треугольника (равнобедренный, равносторонний, разносторонний).*/

package Tasks;

import java.util.Scanner;

public class Task02 {
    Scanner in = new Scanner(System.in);

    private int sideA;
    private int sideB;
    private int sideC;

    private int inputNum(String str) {
        int num;
        System.out.printf("Input side %s number: %n", str);

        while (!in.hasNextInt()) {
            System.out.println("That not a number!");
            in.next(); // this is important!
            System.out.printf("Input side %s number: %n", str);
        }
        num = in.nextInt();

        System.out.printf("Side %s = %d%n", str, num);
        return num;
    }


    //Triangle type definition
    public void triangleType() {
        sideA = inputNum("A");
        sideB = inputNum("B");
        sideC = inputNum("C");
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA)
            System.out.println("This triangle does not exist!!!");
        else if (sideA == sideB && sideA == sideC)
            System.out.println("This triangle is equilateral");
        else if (sideA == sideB || sideB == sideC || sideC == sideA)
            System.out.println("This triangle is isosceles");
        else
            System.out.println("This triangle is versatile");
    }
}

