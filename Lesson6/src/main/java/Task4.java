import java.math.BigInteger;
import java.util.Scanner;

//Найти n-ую строку Треугольника Паскаля и вывести ее на экран
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number of string");
        int num = in.nextInt();
        BigInteger[] string = new BigInteger[num];
        for (int k = 0; k < num; k++) {
            string[k] = getFactorial(num - 1).divide((getFactorial(k).multiply(getFactorial(((num - 1) - k)))));
        }
        for (int i = 0; i < num; i++) {
            System.out.print(string[i] + " ");
        }
    }

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

