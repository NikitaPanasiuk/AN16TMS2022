import java.lang.reflect.Array;
import java.util.ArrayList;

public class MilitaryOffice {

    static Person[] personRegistry;

    MilitaryOffice(Person[] personRegistry) {
        MilitaryOffice.personRegistry = personRegistry;
    }

    public static void showAllFitForMilitaryService() {
        for (int i = 0; i < personRegistry.length; i++) {
            if (Person.age >= 18 && Person.age < 27 && Person.male == "man") {
                System.out.println(Person.name);
            }
        }
    }

    public static void showAlexanderFitForMilitaryService() {
        int number = 0;
        for (int i = 0; i < personRegistry.length; i++) {
            if (Person.age >= 18 && personRegistry[i].age < 27 && Person.name == "Alexander" && Person.male == "man") {
                number++;
            }
        }
        System.out.println("num of recruits named Alexander is " + number);
    }

    public static void showFitForMilitaryServiceWithAge25_27() {
        int number = 0;
        for (int i = 0; i < personRegistry.length; i++) {
            if (Person.age >= 25 && Person.age < 27 && Person.male == "man") {
                number++;
            }
        }
        System.out.println("num of recruit with age from 25 to 27 is " + number);
    }

    public static void showMinskFitForMilitaryService() {
        int number = 0;
        for (int i = 0; i < personRegistry.length; i++) {
            if (Person.age >= 18 && Person.age < 27 && Person.city == "Minsk" && Person.male == "man") {
                number++;
            }
        }
        System.out.println("num of recruit in Minsk is " + number);

    }
}
