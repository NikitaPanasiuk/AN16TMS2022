package by.tms.task3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        FileWriter fw = new FileWriter("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task3\\output.txt");
        Scanner in = new Scanner(new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task3\\text.txt"));
        Scanner in1 = new Scanner(new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task3\\censorList.txt"));
        text.append(in.nextLine());
        while (in.hasNext()) {
            text.append(in.nextLine());
        }
        String[] textSentences = text.toString().split("[.!?]\\s*");
        String[] blackListWords = String.valueOf(in1.nextLine()).split("\\s");
        int count = 0;
        for (String textSentence : textSentences) {
            boolean flag = false;
            String[] textWords = textSentence.split("\\s");
            for (String textWord : textWords) {
                for (String blackListWord : blackListWords) {
                    if (textWord.equalsIgnoreCase(blackListWord) && !flag) {
                        count++;
                        fw.write("\n " + textSentence);
                        flag = true;
                    }
                }
            }
        }
        fw.write("\n количество предложений не прошедших цензуру " + count);
        fw.close();
    }
}

