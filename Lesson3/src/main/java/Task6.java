import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("Чтобы выйти из программы нажмите 0, Чтобы продолжить, введите любое другое целое число");
            x = in.nextInt();
            System.out.println("Введите количество програмистов");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                countDevs(n);
            } else {
                System.out.println("Вы ввели нецелое число или символ, попробуйте снова");
                in.next();
            }
        } while (x != 0);
    }

    public static void countDevs(int count) {
        int z = count % 10;
        int x = count % 100;
        if (x >= 11 && x <= 20) {
            System.out.println(count + " програмистов");
        } else {
            if (z == 1) {
                System.out.println(count + " програмист");
            } else {
                if (z >= 2 && z <= 4) {
                    System.out.println(count + " програмиста");
                } else {
                    System.out.println(count + " програмистов");
                }
            }
        }
    }
}





