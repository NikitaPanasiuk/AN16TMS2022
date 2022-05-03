import java.util.Scanner;

//* Необходимо прочитать с консоли значение числа типа int,
//* сделать проверку что если пользователь ввел не положительное число,
// * то вывести ошибку и отправить пользователя вводить заново новое число!
//* далее создать одномерный массив типа int размера прочитанного с консоли
//* далее заполнить массив случайными значениями
//* далее вывести массив на консоль
//*/
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input number of array elements");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (n <= 0) {
                    System.out.println("You input negative or zero number");
                } else {
                    printArray(n);
                }
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }

    private static void printArray(int num) {
        int[] mass = new int[num];
        for (int i = 0; i < num; i++) {
            mass[i] = Integer.MIN_VALUE + (int) (Math.random() * Integer.MAX_VALUE);
            System.out.println(mass[i]);
        }
    }
}
