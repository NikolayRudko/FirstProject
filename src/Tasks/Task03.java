/*Написать программу вычисления стоимости покупки с учетом скидки.
Скидка в 3% предоставляется, если сумма покупки больше 500 руб., в 5% - если сумма больше 1000 руб.
 */

package Tasks;

import java.util.Scanner;

public class Task03 {
    Scanner in = new Scanner(System.in);

    private double price;
    private double discountedPrice;

    private double inputNum() {
        double num;
        System.out.println("Input positive price: ");

        do {
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next(); // this is important!
                System.out.print("Input positive number: ");
            }
            num = in.nextDouble();
        } while (num <= 0);
        System.out.printf("Price = %.2f%n", num);
        return num;
    }

    //Discounted pricing
    public void discounted() {
    price = inputNum();
        if (price < 500)
            discountedPrice = price;                //no discount
        else if (price >= 500 && price < 1000)
            discountedPrice = price * 0.97;         //3% discount
        else
            discountedPrice = price * 0.95;         //5% discount
        System.out.printf("Discounted price = %.2f%n", discountedPrice);
    }
}
