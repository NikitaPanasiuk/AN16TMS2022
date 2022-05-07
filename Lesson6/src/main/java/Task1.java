import java.math.BigInteger;
import java.util.Scanner;

//    1)Поиск n-го числа Фибоначчи. Вывести числа на консоль для n=11 и n=128
//    Пример: n=11 в ответе должно вывести число 89
//    Напоминаем, что:
//    первый и второй члены последовательности равны единицам
//    а каждый следующий — сумме двух предыдущих
//    То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] mass = new BigInteger[n];
        mass[0] = BigInteger.valueOf(1);
        mass[1] = BigInteger.valueOf(1);
        for (int i = 2; i < n; i++) {
            mass[i] = mass[i - 1].add(mass[i - 2]);
        }
        System.out.println(mass[n - 1]);
    }
}
