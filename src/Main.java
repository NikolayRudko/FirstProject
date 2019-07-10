import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] MenuItem = new String[]
                {
                        "1 - Search max numbers",
                        "2 - Triangle type definition",
                        "3 - Discounted pricing",
                        "4 - Calculation of factorial",
                        "5 - The remainder of the division",
                        "6 - Replacing the negative elements of the array",
                        "7 - Matrix rotation",
                        "8 - Determining the number of special elements of the array",
                        "9 - String calculation",
                        "10- Encryption text"
                };

        char choiceMenu;
        do {
            System.out.println("Enter menu item 1-10:");

            for (String item : MenuItem)
                System.out.println(item);

            int numItem = in.nextInt();

            switch (numItem) {
                case 1:
                    Task01 task01 = new Task01();
                    task01.maxNumber();
                    break;
                case 2:
                    Task02 task02 = new Task02();
                    task02.triangleType();
                    break;
                case 3:
                    Task03 task03 = new Task03();
                    task03.discounted();
                    break;
                case 4:
                    Task04 task04 = new Task04();
                    task04.factorialCalculation();
                    break;
                case 5:
                    Task05 task05 = new Task05();
                    task05.division();
                    break;
                case 6:
                    Task06 task06 = new Task06();
                    task06.replacingNegativeItems();
                    break;
                case 7:
                    Task07 task07 = new Task07();
                    task07.rotateOriginMatrix();
                    break;
                case 8:
                    Task08 task08 = new Task08();
                    task08.searchSpecialElements();
                    break;
                case 9:
                    Task09 task09 = new Task09();
                    task09.workWithWords();
                case 10:
                    Task10 task10 = new Task10();
                    task10.encryption();
                default:
                    System.out.println("This menu item is not found.");
            }
            System.out.println("If you want to continue with the menu enter \"Y\" or \"y\"");
            choiceMenu = in.next(".").charAt(0);
        }
        while (choiceMenu == 'Y' || choiceMenu == 'y');

    }
}