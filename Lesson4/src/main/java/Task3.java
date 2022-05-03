//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input random whole number");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                String length = "" + n;
                if (n > 0) {
                    System.out.println("The " + n + " number is positive");
                } else {
                    if (n < 0) {
                        System.out.println("The " + n + " number is negative");
                    } else {
                        System.out.println("The " + n + " number is non-negative and non-positive");
                    }
                }
                System.out.println("The number of digits in a number " + length.length());

            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }
}

