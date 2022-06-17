package by.tms.task6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Report {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public void generateReport() {
        final String[] words = fullName.split("\\s");
        String fullName1 = words[0].charAt(0) + "." + words[1].charAt(0) + "." + " " + words[2];
        System.out.printf("%s", fullName1);
        System.out.print(" ");
        System.out.printf("%.2f", salary);
        System.out.println();
    }
}

