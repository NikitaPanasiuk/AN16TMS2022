package by.tms.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;


public class Main1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task1\\input.txt");

        //ñîçäàåì îáúåêò FileReader äëÿ îáúåêòà File
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task1\\output.txt");
        //ñîçäàåì BufferedReader ñ ñóùåñòâóþùåãî FileReader äëÿ ïîñòðî÷íîãî ñ÷èòûâàíèÿ
        BufferedReader reader = new BufferedReader(fr);
        // ñ÷èòàåì ñíà÷àëà ïåðâóþ ñòðîêó
        String line = reader.readLine();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(line);
        while (line != null) {
            line = reader.readLine();
            arrayList.add(line);
        }
        for (String str : arrayList) {
            if (isPalindrome(str)) {
                System.out.println(str);
                fw.write(" " + str);
            }
        }
        fr.close();
    }

    public static boolean isPalindrome(String str) {
        if (str != null) {
            return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        }
        return false;
    }

}


