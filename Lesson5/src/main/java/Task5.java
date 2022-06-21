// 5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
// Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
// Снова выведете массив на экран на отдельной строке.
public class Task5 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = (int) (Math.random() * 20);
            System.out.print(mass[i] + " ");
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            mass[i] = (int) (Math.random() * 20);
            // 0 у нас нечетным не является, поэтому просто вывожу mass[0]
            if (i % 2 != 0) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
    }
}
