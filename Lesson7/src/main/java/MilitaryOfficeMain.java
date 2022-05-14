
import java.util.Scanner;

public class MilitaryOfficeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Person[] personRegister = new Person[n];
        for (int i = 0; i < n; i++) {
            personRegister[i] = new Person();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("input age");
            personRegister[i].age = in.nextInt();
            System.out.println("input city");
            personRegister[i].city = in.next();
            System.out.println("input name");
            personRegister[i].name = in.next();
            System.out.println("input country");
            personRegister[i].country = in.next();
            System.out.println("input male");
            personRegister[i].male = in.next();
        }
        MilitaryOffice office1 = new MilitaryOffice(personRegister);
        office1.showAllFitForMilitaryService();
        office1.showFitForMilitaryServiceWithAge25_27();
        office1.showMinskFitForMilitaryService();
        office1.showMinskFitForMilitaryService();

    }
}
