import java.util.Scanner;
//задача на поиск четного или не четного
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of array elements: ");
        if (in.hasNextInt()) {
            int i = in.nextInt();
            int num;
            System.out.println("Input a random whole number");
            for (int z = 0 ; z < i; z++) {
                if (in.hasNextInt()) {
                    num = in.nextInt();
                        if ((num % 2) == 0) {
                            System.out.print("This number is even " + num);
                        } else {
                            System.out.print("This number is non-even " + num);
                        }
                } else {
                    System.out.println("You input non-whole number, try again");
                    z--;
                }
            }
        } else {
            System.out.print("You put wrong number or symbol");
        }
    }
}
