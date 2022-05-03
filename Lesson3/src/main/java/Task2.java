import java.util.Scanner;

//задача на поиск четного или не четного
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To stop program input 0, to continue input another number");
            x = in.nextInt();
            System.out.print("Input a random whole number ");
            if (in.hasNextInt()) {
                int num = in.nextInt();
                if ((num % 2) == 0) {
                    System.out.print("This number is even " + num);
                } else {
                    System.out.print("This number is non-even " + num);
                }
            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }
}




