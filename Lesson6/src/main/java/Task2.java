import java.util.Scanner;

//2)На стандартной шахматной доске 8х8 заданы координаты двух клеток.
//    Требуется определить: имеют ли данные клетки одинаковый цвет?
//    на консоль выведите YES, если поля одного цвета, или слово NO в противном случае.
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        Scanner in = new Scanner(System.in);
        System.out.println("Input indexes of firs element ");
        int i1 = in.nextInt();
        int j1 = in.nextInt();
        System.out.println("Input indexes of second element ");
        int i2 = in.nextInt();
        int j2 = in.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matrix[i][j] = 0;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        if (matrix[i1][j1] == matrix[i2][j2]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

