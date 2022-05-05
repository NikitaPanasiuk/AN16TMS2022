import java.util.Scanner;

/**
 * Шаги по реализации:
 * - Прочитать два int из консоли
 * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
 * - Заполнить массив случайными значениями (до 100)
 * - Вывести в консоль матрицу заданного размера, но:
 * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
 * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
 * - В противном случае выведите "*"
 * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of string of matrix");
        int n = in.nextInt();
        System.out.println("Input number of column of matrix");
        int x = in.nextInt();
        int[][] matrix = new int[n][x];
        System.out.println("Matrix");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = (int) (Math.random() * 101);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        matrix[1][1] = 21;
        char[][] matrix1 = new char[n][x];
        System.out.println("new Matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] % 3 == 0) {
                    matrix1[i][j] = '+';
                } else {
                    if (matrix[i][j] % 7 == 0) {
                        matrix1[i][j] = '-';
                    } else {
                        matrix1[i][j] = '*';
                    }
                }
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}