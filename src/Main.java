import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter menu item 1-10:");
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
        }
        System.out.println("First commit Git");
    }
}
