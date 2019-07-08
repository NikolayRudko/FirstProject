/*Дана строка текста, в которой слова разделены пробелами.
Необходимо:
  - определить количество слов в строке;
  - найти самое длинное слово и вывести его на экран;
  - поменять местами первое и последнее слова в строке, затем вывести текст на экран.
*/

import java.util.Scanner;

public class Task09 {
    private String str;
    private String modStr = "";
    private String[] words;

    Scanner in = new Scanner(System.in);

    private void input() {
        System.out.println("Enter string: ");
        str = in.nextLine();
        //str = "I am sexy i am know it";
        System.out.printf("String entered: %s%n", str);
    }

    private void searchQuantity() {
        words = str.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        System.out.printf("Quantity words in string: %d%n", words.length);
    }

    //Search long word
    private void searchMostLongWord() {
        String longWord = "";
        //Long word
        for (String strTemp : words)
            if (strTemp.length() > longWord.length())
                longWord = strTemp;
        System.out.printf("The long word: %s%n", longWord);
    }

    private void swappedWords() {
        //Swapped words
        char space = '\u0020';
        String strSwappedTemp;
        System.out.println("Modified string: ");

        strSwappedTemp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = strSwappedTemp;
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1)
                modStr += words[i] + space;
            else
                modStr += words[i];
        }
        System.out.println(modStr);
    }

    public void workWithWords() {
        input();
        searchQuantity();
        searchMostLongWord();
        swappedWords();
    }
}
