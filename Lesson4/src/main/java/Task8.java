import java.util.Scanner;

/**
 * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
 * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
 * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
 * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input random whole number");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                foobar(n);
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    public static void foobar(int number) {
        int z = number % 3;
        int p = number % 5;
        if (p == 0 && z == 0) {
            System.out.println("foobar");
        } else {
            if (z == 0) {
                System.out.println("foo");
            } else {
                if (p == 0) {
                    System.out.println("bar");
                }
            }
        }
    }
}

