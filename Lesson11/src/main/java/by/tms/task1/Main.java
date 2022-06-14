package by.tms.task1;

import java.util.Scanner;

//* 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        int i1 = 0;
        int i2 = 0;
        boolean ifA = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' && !ifA) {
                i1 = i;
                ifA = true;
            }
            if (arr[i] == 'b') {
                i2 = i;
            }
        }
        System.out.println(str.substring(i1, i2 + 1));
    }
}
