package by.tms.task2;

import java.util.Arrays;
import java.util.Scanner;

// * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        char symbol3 = arr[3];
        char symbol0 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol3) {
                arr[i] = symbol0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
