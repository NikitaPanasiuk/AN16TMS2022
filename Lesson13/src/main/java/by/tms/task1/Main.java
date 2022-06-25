package by.tms.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFile(new File("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson13\\src\\main\\java\\by\\tms\\task1"), fileList);
    }

    private static void searchFile(File rootFolder, List<File> fileList) {
        if (rootFolder.isDirectory()) {
            File[] directoryFiles = rootFolder.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                        System.out.println(file.getName() + " это папка ");
                    } else {
                        System.out.println(file.getName() + " это файл");
                    }
                }
            }

        }
    }
}
