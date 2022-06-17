import java.util.Scanner;

/**
 * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of string of matrix");
        int n = in.nextInt();
        System.out.println("Input number of column of matrix");
        int[][] matrix = new int[n][n];
        int sum = 0;
        System.out.println("Matrix");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("sum of all diagonal elements " + sum);
    }
}
