import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//**
//* Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
//* - if number положительное число, то необходимо number увеличить на 1
//* - if number отрицательное - уменьшить на 2
//* - if number равно 0 , то замените значение number на 10
//* вернуть number после выполнения операций
//*
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input random whole number");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                System.out.println(operation(n));
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    public static int operation(int number) {
        if (number > 0) {
            return (number = number + 1);
        } else {
            if (number < 0) {
                return number = number - 2;
            } else {
                return 10;
            }
        }
    }
}
