package by.tms.task3;

import java.util.Scanner;

//вывести слова палиндромы
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input num of words");
        if (in.hasNextInt()) {
            int n = in.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.next();
            }
            for (String s : arr) {
                StringBuffer rev = new StringBuffer(s).reverse();
                String strRev = rev.toString();
                if (s.equalsIgnoreCase(strRev)) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println("wrong symbol");
        }
    }
}


