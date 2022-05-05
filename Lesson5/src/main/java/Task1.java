import java.util.Scanner;

//        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input first number");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                System.out.println("Input second number");
                if (in.hasNextInt()) {
                    int z = in.nextInt();
                    System.out.println(summ(n, z));
                } else {
                    System.out.println("You input non-whole number or symbol, try again");
                    in.next();
                }
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    public static int summ(int a1, int b1) {
        int umn = 0;
        for (int i = 0; i < Math.abs(b1); i++) {
            umn = umn + a1;
        }
        if (a1 < 0 && b1 < 0)
            return -umn;
        else {
            if (a1 > 0 && b1 < 0) {
                return -umn;
            } else {
                return umn;
            }
        }
    }
}
