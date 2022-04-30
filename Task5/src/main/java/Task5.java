import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of array elements: ");
        int i = in.nextInt();
        double[] num = new double[i];
        System.out.println("Input a random number");
        double max = Math.abs(num[0]);
        for (i = 0; i < num.length; i++) {
            num[i] = in.nextDouble();
            if (Math.abs(num[i]) > max) {
                max = Math.abs(num[i]);
            }
        }
        System.out.println("Module max number is " + max);
    }
}