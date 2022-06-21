package by.tms.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder s = new StringBuilder();
        FileWriter fr = new FileWriter("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task1\\output.txt");
        Scanner in = new Scanner(new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task1\\input.txt.txt"));
        while (in.hasNext())
            s.append(in.nextLine());
        // ------------------------------------
        String[] a = s.toString().split("\\s"); //!!!!

        for (String str : a) {
            if (isPalindrome(str)) {
                System.out.println(str);
                fr.write(" " + str);
            }
        }
        fr.close();
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
