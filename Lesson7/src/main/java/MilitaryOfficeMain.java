
import java.util.Scanner;

public class MilitaryOfficeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of person");
        int n = in.nextInt();
        Person[] personRegister = new Person[n];
        for (int i = 0; i < n; i++) {
            personRegister[i] = new Person();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("input age");
            int age = in.nextInt();
            personRegister[i].setAge(age);
            System.out.println("input city");
            String city = in.next();
            personRegister[i].setCity(city);
            System.out.println("input name");
            String name = in.next();
            personRegister[i].setName(name);
            System.out.println("input country");
            String country = in.next();
            personRegister[i].setCountry(country);
            System.out.println("input male");
            String male = in.next();
            personRegister[i].setMale(male);
        }
        MilitaryOffice office1 = new MilitaryOffice(personRegister);
        office1.showAllFitForMilitaryService();
        office1.showFitForMilitaryServiceWithAge25_27();
        office1.showMinskFitForMilitaryService();
        office1.showAlexanderFitForMilitaryService();

    }
}
