import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of elements: ");
        if (in.hasNextInt()) {
            int i = in.nextInt();
            int num;
            for (int z = 0; z < i ; z++) {
                System.out.println("Input a random whole number");
                if (in.hasNextInt()) {
                    num = in.nextInt();
                    if ((num % 2) == 0) {
                        System.out.print("This number is even " + num);
                    } else {
                        System.out.print("This number is non-even " + num);
                    }
                } else {
                    System.out.println("You input non-whole number, try again");
                    //z--;
                }
            }
        } else {
            System.out.println("It's not a number or not int number");
        }
    }
}
