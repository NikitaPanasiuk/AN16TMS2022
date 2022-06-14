package by.tms.task6;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = {new Employee("Alexander Nikolaevich Zubrov", 803.2123),
                new Employee("Андрей Александрович Волков", 200.1234)};
        arr[0].generateReport();
        arr[1].generateReport();
    }
}
