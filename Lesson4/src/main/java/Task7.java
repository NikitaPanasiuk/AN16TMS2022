import java.util.Scanner;

/**
 * На вход приходит массив целых чисел типа int
 * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
 * в котором это значение распечатается на консоль.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input numbers of array elements");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                int[] mass = new int[n];
                for (int i = 0; i < n; i++) {
                    mass[i] = Integer.MIN_VALUE + (int) (Math.random() * Integer.MIN_VALUE);
                }
                System.out.println(calculateCountOfOddElementsInMatrix(mass));
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int z = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 != 0) {
                z = z + 1;
            }
        }
        return z;
    }
}
