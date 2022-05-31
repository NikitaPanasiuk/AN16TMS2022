package by.tms.dress;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(new GucciJacket(), new GucciBoots(), new GucciPants());
        person.up();
        person.down();
    }
}
