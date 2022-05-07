import java.math.BigInteger;
import java.util.Scanner;

//Найти n-ую строку Треугольника Паскаля и вывести ее на экран
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number of string");
        int num = in.nextInt();
        BigInteger[][] string = new BigInteger[num][num];
        for (int n = 0; n < num; n++) {
            for (int k = 0; k < num; k++) {
                string[n][k] = getFactorial(n).divide((getFactorial(k).multiply(getFactorial((n - k)))));
            }
        }
        for (int j = 0; j < num; j++) {
            System.out.print(string[num - 1][j] + " ");
        }
    }

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

