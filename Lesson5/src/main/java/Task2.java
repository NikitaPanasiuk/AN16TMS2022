//  2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
public class Task2 {
    public static void main(String[] args) {
        char[][] mass = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mass[i][j] = '*';
                if (i >= j) {
                    System.out.print(" " + mass[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i <= j) {
                    System.out.print(" " + mass[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i + j) < 3) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + mass[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + mass[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

