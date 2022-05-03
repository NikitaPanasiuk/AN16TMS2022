import java.util.Scanner;

/**
 * Задача со звездочкой!
 * Метод должен печатать все простые до указанного числа
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("enter an upper bound for the search for primes");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                n++;
                printPrimeNumbers(n);
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    public static void printPrimeNumbers(int number) {
        int[] mass = new int[number];
        for (int i = 1; i < number; i++) {
            mass[i] = i;
        }

        for (int i = 0; i < number; i++) {
            int q = 1;
            int z=0;
            while (q <= mass[i]) {
                if (mass[i] % q == 0) {
                    z++;
                }
                q = q + 1;
            }
            if (z==2) {
                System.out.println(mass[i]);
            }
        }
    }
}





