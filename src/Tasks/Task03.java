/*Написать программу вычисления стоимости покупки с учетом скидки.
Скидка в 3% предоставляется, если сумма покупки больше 500 руб., в 5% - если сумма больше 1000 руб.
 */

package Tasks;

import Tasks.MyException.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {

    private double inputNum() {
        Scanner scanner = new Scanner(System.in);
        double num;
        while (true) {
            try {
                System.out.println("Enter the purchase price. Enter only a positive double.");
                num = scanner.nextInt();
                if (num <= 0)
                    throw new MyException("Number (" + num + ") is not positive double.");
                return num;
            } catch (InputMismatchException|MyException e) {
                scanner.nextLine();
                System.out.println("Exception: " + e);
                System.out.println("That’s not a positive double. Try again: ");
            }
        }
    }

    //Discounted pricing
    public void discounted() {
        double price = inputNum();
        double discountedPrice;
        double discount;
        if (price < 500)
            discountedPrice = price;                //no discount
        else if (price >= 500 && price < 1000)
            discountedPrice = price * 0.97;         //3% discount
        else
            discountedPrice = price * 0.95;         //5% discount
        discount = price - discountedPrice;
        System.out.printf("Discounted price = %.2f, discount = %.2f.\n", discountedPrice, discount);
    }
}
