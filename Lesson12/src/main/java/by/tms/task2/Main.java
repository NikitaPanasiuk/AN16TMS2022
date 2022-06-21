package by.tms.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task2\\input.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task2\\output.txt", true);
        // считаем сначала первую строку
        String line = reader.readLine();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(line);
        while (line != null) {
            line = reader.readLine();
            arrayList.add(line);
        }
        String preSentences = String.valueOf(arrayList);
        final String[] sentences = preSentences.split("[.!?]\\s*");
        for (String sentence : sentences) {
            if (isPol(sentence)) {
                fw.write(" " + sentence);
                System.out.println(sentence);
            } else if (returnNumWord(sentence) >= 3 && returnNumWord(sentence) <= 5) {
                fw.write(" " + sentence);
                System.out.println(sentence);
            }
        }
        fr.close();
    }


    private static int returnNumWord(String text) {
        final String[] words = text.split("\\s");
        return words.length;
    }

    private static boolean isPol(String text) {
        final String[] words = text.split("\\s");
        for (String s : words) {
            StringBuffer rev = new StringBuffer(s).reverse();
            String strRev = rev.toString();
            if (s.equalsIgnoreCase(strRev) && s.length() > 2) {
                return true;
            }
        }
        return false;
    }
}


