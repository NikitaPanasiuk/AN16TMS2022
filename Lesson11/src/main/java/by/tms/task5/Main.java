package by.tms.task5;

// * 5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//     * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
public class Main {
    public static void main(String[] args) {
        String[] arr = {"string", "code", "practice", "zip"};
        for (String s : arr) {
            if (s.length() % 2 == 0) {
                System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
            }
        }
    }
}
