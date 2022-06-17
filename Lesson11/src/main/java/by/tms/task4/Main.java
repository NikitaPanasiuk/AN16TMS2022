package by.tms.task4;

import java.util.Scanner;

//4) Есть строка в которой содержится текст, предложения разделены точками.
//     * После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
//     * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
//     * Пишем все в ООП стиле.
//     * 1. Метод принимает строку и возвращает кол-во слов в строке.
//     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//     * В main создаем строку с текстом, также можно текст задавать с консоли.
//     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//     * Если подходит, то выводим на экран.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input text");
        String text = in.next();
        final String[] sentences = text.split("[.!?]\\s*");
        for (String sentence : sentences) {
            if (isPol(sentence)) {
                System.out.println(sentence);

            } else if (returnNumWord(sentence) >= 3 && returnNumWord(sentence) <= 5) {
                System.out.println(sentence);
            }
        }
    }

    private static int returnNumWord(String text) {
        final String[] words = text.split("\\s");
        return words.length;
    }

    private static boolean isPol(String text) {
        final String[] words = text.split("\\s");
        for (String s : words) {
            StringBuffer rev = new StringBuffer(s).reverse();
            String strRev = rev.toString();
            if (s.equalsIgnoreCase(strRev) && s.length() > 2) {
                return true;
            }
        }
        return false;
    }
}
