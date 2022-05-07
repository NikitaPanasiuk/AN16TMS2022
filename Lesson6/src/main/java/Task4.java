import java.util.Scanner;

//Найти n-ую строку Треугольника Паскаля и вывести ее на экран
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number of string");
        int num = in.nextInt();
        int[][] string = new int[num][num];
        for (int n = 0; n < num; n++) {
            for (int k = 0; k < num; k++) {
                string[n][k] = getFactorial(n) / (getFactorial(k) * getFactorial((n - k)));
            }
        }
        for (int j = 0; j < num; j++) {
            System.out.print(string[num - 1][j] + " ");
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
