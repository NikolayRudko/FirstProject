/*Написать программу вычисления стоимости покупки с учетом скидки.
Скидка в 3% предоставляется, если сумма покупки больше 500 руб., в 5% - если сумма больше 1000 руб.
 */

import java.util.Scanner;

public class Task03 {
    Scanner in = new Scanner(System.in);

    private double price;
    private double discountedPrice;

    //Input and print input price
    private void inputPrice() {
        price = inputDouble("Input price: ");
        System.out.printf("Price = %.2f%n", price);
    }

    //Input positive number
    private double inputDouble(String str) {
        double number;
        do {
            System.out.println(str);
            number = in.nextDouble();
        } while (number <= 0);
        return number;
    }

    //Discounted pricing
    public void discounted() {
        inputPrice();
        if (price < 500)
            discountedPrice = price;                //no discount
        else if (price >= 500 && price < 1000)
            discountedPrice = price * 0.97;         //3% discount
        else
            discountedPrice = price * 0.95;         //5% discount
        System.out.printf("Discounted price = %.2f%n", discountedPrice);
    }
}
