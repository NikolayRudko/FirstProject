/*Имеется следующее правило шифрования: каждая буква русского алфавита заменяется на букву идущую через 3 после нее
(например, а -> д). Исходную строку назовем источник, результирующую – шифровка.
Напишите программу для создания шифровки и получения источника.
Формат ввода:
<строка>
<1|2> // 1 - получить шифровку, 2 - получить источник.
Реализуйте все задачи в одной программе. Доступ к каждой задаче осуществляйте через пункт меню.
*/

import java.util.Scanner;

public class Task10 {
    Scanner in = new Scanner(System.in);

    private int selectEncryption;       //Choice of encryption or decryption
    private String text;                //Origin text
    private String encryptionText = "";      //Encryption text
    private int shift;              //Encryption Shift
    private char[] books = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й',
            'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф',
            'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
            'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
            'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private char spaсe = '\u0020';

    //enter text
    private void inputText() {
        //индикатор наличия неправильного символа
        boolean triger = true;
        /*зацикленный ввод строки пока не булет введена правильная строка
        содержащая только русские буквы или пробел*/
        do {
            //индикатор наличия неправильного символа имеет начальное значение положительное
            System.out.println("Ввелите текст, используйте только символы:\nА-Я, а-я или \"пробел\"\n");
            //считывание строки из консоли
            text = in.nextLine();
            System.out.printf("Введеный текст: %s%n", text);
            //проверка введенного текста на помтороние символы:
            //в первом цикле мы проверяем каждый символ ввеленной строки
            for (int i = 0; i < text.length(); i++) {
                //проверка каждого символа из строки с символом из массива разрешенных символов
                for (char symbol : books) {
                    /*как только символ совпалает с символом из массива разрешенных символов
                    индикатор наличия неправильного символа приобретает значение true
                    начинается проверка следующего символа*/
                    if (text.charAt(i) == symbol || text.charAt(i) == spaсe) {
                        triger = true;
                        break;
                    }
                    /*если за весь цикл индикатор наличия неправильного символа остался false
                    тогда как следствие  цикл while будет будет повторен*/
                    else
                        triger = false;
                }
            }
        } while (!triger);
    }

    private void inputShift() {
        System.out.println("Введите смещение:");
        shift = in.nextInt();
        if (shift > books.length / 2) shift %= books.length / 2;
    }

    private void encryption() {
        //проход по каждому символу исходной строки
        for (int i = 0; i < text.length(); i++) {
            //сравниваем с кажым символом из массива разрешенных символов
            for (int j = 0; j < books.length; j++) {
                //если знак пробел
                if (text.charAt(i) == spaсe) {
                    encryptionText = encryptionText + spaсe;
                    break;
                }
                //работа с большими буквами
                if (text.charAt(i) == books[j] && j < books.length / 2) {
                    if (j + shift < books.length / 2)
                        encryptionText = encryptionText + books[j + shift];
                    else
                        encryptionText = encryptionText + books[j - books.length / 2 + shift];
                    break;
                }
                //работа с  маленькимибуквами
                if (text.charAt(i) == books[j]) {
                    if (j + shift < books.length)
                        encryptionText = encryptionText + books[j + shift];
                    else
                        encryptionText = encryptionText + books[j - books.length / 2 + shift];
                    break;
                }
            }
        }
    }

    public void menuEncryption() {
        //ввод текста
        inputText();
        //inputTextMod();
        inputShift();
        encryption();
        System.out.println("Вывести:\n1. Исходный текст\n2. Шифрованный текст.");
        selectEncryption = in.nextInt();
        switch (selectEncryption) {
            case 1:
                System.out.println(text);
                break;
            case 2:
                System.out.println(encryptionText);
                break;
            default:
                System.out.println("Таккой пункт не найден");
        }
    }
/*
    //enter text
    private void inputTextMod() {
        //индикатор наличия неправильного символа
        boolean triger;
        //зацикленный ввод строки пока не булет введена правильная строка
        //содержащая только русские буквы или пробел
        do {
            triger = true;
            //индикатор наличия неправильного символа имеет начальное значение положительное
            System.out.println("Ввелите текст, используйте только символы:\nА-Я, а-я или \"пробел\"\n");
            //считывание строки из консоли
            text = in.nextLine();
            System.out.printf("Введеный текст: %s%n", text);
            //проверка введенного текста на постороние символы:
            // \u0410 - \u042F - А - Я
            // \u0430 - \u044F - а - я
            // \u0401 & \u0451 - ё - Ё
            // \u0410 - \u042F - 1-9,0,  space and other special characters
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) >= '\u0410' & text.charAt(i) >= '\u042F') ||
                        (text.charAt(i) >= '\u0430' & text.charAt(i) >= '\u044F') ||
                        (text.charAt(i) == '\u0401') || (text.charAt(i) == '\u0451') ||
                        (text.charAt(i) >= '\u0420' & text.charAt(i) >= '\u0440')) {

                    triger = true;
                }
                else{
                    System.out.println("Error unknown symbol:" + text.charAt(i));
                    triger = false;
                    break;
                }
            }
        } while (!triger);
    }
*/
}
