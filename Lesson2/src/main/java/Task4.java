import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of array elements: ");
        int i = in.nextInt();
        double[] num = new double[i];
        System.out.println("Input a random whole number");
        for (i = 0; i < num.length; i++) {
            num[i] = in.nextDouble();
            if ((num[i] % 2) != 0) {
                System.out.println("You input non-whole number, try again");
                i--;
            } else {
                if ((num[i] % 2) == 0) {
                    System.out.print("This number is even " + num[i]);
                } else {
                    System.out.print("This number is non-even " + num[i]);
                }
            }
        }
    }
}