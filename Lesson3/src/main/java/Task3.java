import java.util.Scanner;
//задача на поиск минимального по модулю
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of array elements: ");
        int i = in.nextInt();
        double[] num = new double[i];
        double min = Integer.MAX_VALUE;
        for (i = 0; i < num.length; i++) {
            System.out.println("Input a random number");
            num[i] = in.nextDouble();
            double module = Math.abs(num[i]);
            if (module < min) {
                min = module;
            }
        }
        System.out.println("Module min number is " + min);
    }
}
