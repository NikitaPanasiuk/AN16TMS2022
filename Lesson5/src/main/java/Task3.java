// 3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        for (int i = 1; i < 100; i = i + 2) {
            mass[i] = i;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 99; i > 0; i = i - 2) {
            System.out.print(mass[i] + " ");
        }
    }
}
