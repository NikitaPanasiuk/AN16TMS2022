import java.util.Objects;

public class MilitaryOffice {

    Person[] personRegistry;

    MilitaryOffice(Person[] personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void showAllFitForMilitaryService() {
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && Objects.equals(person.getMale(), "man")) {
                System.out.println(person.getName());
            }
        }
    }

    public void showAlexanderFitForMilitaryService() {
        int number = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && Objects.equals(person.getName(), "Alexander") && Objects.equals(person.getMale(), "man")) {
                number++;
            }
        }
        System.out.println("num of recruits named Alexander is " + number);
    }

    public void showFitForMilitaryServiceWithAge25_27() {
        int number = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() < 27 && Objects.equals(person.getMale(), "man")) {
                number++;
            }
        }
        System.out.println("num of recruit with age from 25 to 27 is " + number);
    }

    public void showMinskFitForMilitaryService() {
        int number = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 18 && person.getAge() < 27 && Objects.equals(person.getCity(), "Minsk") && Objects.equals(person.getMale(), "man")) {
                number++;
            }
        }
        System.out.println("num of recruit in Minsk is " + number);

    }
}
