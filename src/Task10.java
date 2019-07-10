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
    private int shift = 3;              //Encryption Shift

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
        //зацикленный ввод строки пока не булет введена правильная строка
        //содержащая только русские буквы или пробел
        do {
            //индикатор наличия неправильного символа имеет начальное значение положительное
            triger = true;
            System.out.println("Ввелите текст, используйте только символы:\n" +
                    "А-Я, а-я или \"пробел\"\n");
            //считывание строки из консоли
            text = in.nextLine();
            System.out.printf("Введеный текст: %s%n", text);
            //проверка введенного текста на помтороние символы:
            //в первом цикле мы проверяем каждый символ ввеленной строки
            for (int i = 0; i < text.length(); i++) {
                //если индикатор наличия неправильного символа false тогда цикл прекращается
                //как следствие будет цикл while будет повторен
                if (!triger) {
                    //вывод сообщения об ошибке
                    System.out.println("Неизвестный символ - ввелите символ заново!");
                    break;
                } else {
                    //проверка каждого символа из строки с символом из массива разрешенных символов
                    for (char symbol : books) {
                        //как только символ совпалает с символом из массива разрешенных символов
                        //индикатор наличия неправильного символа приобретает значение true
                        //начинается проверка следующего символа
                        if (text.charAt(i) == symbol || text.charAt(i) == spaсe) {
                            triger = true;
                            break;
                        }
                        //если за весь цикл индикатор наличия неправильного символа остался false
                        //тогда как следствие  цикл while будет будет повторен
                        else {
                            triger = false;
                        }
                    }
                }
            }
        } while (!triger);
    }

    public void encryption() {
        //ввод текста
        inputText();
        //проход по каждому символу исходной строки
        for (int i = 0; i < text.length(); i++) {
            //сравниваем с кажым символом из массива разрешенных символов
            for (int j = 0; j < books.length; j++) {
                //если знак пробел
                if (text.charAt(i) == spaсe) {
                    encryptionText = encryptionText + spaсe;
                    break;
                }
                if (text.charAt(i) == books[j] && i > (books.length - 1 - shift)) {
                    encryptionText = encryptionText + books[(j % (books.length - 1 - shift)) + books.length / 2];
                    break;
                }
                if (text.charAt(i) == books[j] && i < (books.length - 1 - shift)) {
                    encryptionText = encryptionText + books[j + shift];
                    break;
                }
            }
        }
        System.out.printf("Зашифрованый текст: %s%n", encryptionText);
    }
}
