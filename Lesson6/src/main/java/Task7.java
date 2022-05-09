

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

//Игра с числами
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int number = in.nextInt();
        String number1 = Integer.toBinaryString(number);
        char[] mass = number1.toCharArray();
        StringBuilder str = new StringBuilder();
        ArrayList<Object> arr = new ArrayList<>();
        char[][] mass2 = new char[mass.length][mass.length];
        System.arraycopy(mass, 0, mass2[0], 0, mass.length);
        for (int i = 1; i < mass.length; i++) {
            char temp1 = mass2[i - 1][mass.length - 1];
            System.arraycopy(mass2[i - 1], 0, mass2[i], 1, mass.length - 1);
            mass2[i][0] = temp1;
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                str.append(mass2[i][j]);
            }
            arr.add(str.toString());
            str = new StringBuilder();
        }
        BigInteger max = BigInteger.valueOf(0);
        for (int i = 0; i < arr.size(); i++) {
            BigInteger temp = new BigInteger((String) arr.get(i), 2);
            if (temp.compareTo(max) > 0) {
                max = temp;
            }
        }

        System.out.println(number + "  " + max);

    }
}
