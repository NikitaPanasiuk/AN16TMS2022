//    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        System.out.println("Matrix");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrix1 = new int[10][8];
        for (int i = 0; i < 10; i++) {
            int sum;
            for (int j = 0; j < 8; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
                matrix1[i][j] = sum;
            }
        }
        int max = matrix1[0][0];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix1[i][j] > max) {
                    max = matrix1[i][j];
                    i1 = i;
                    i2 = j;
                }
            }
        }
        System.out.println("new Matrix");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max sum  " + max + " Index of firs element " + i1 + " " + i2);
    }
}




