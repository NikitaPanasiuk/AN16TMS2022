package by.tms.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(8, "V8"), new GasTank("Дизель", "50"), "Двигатель", "250", "20000");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task4\\output.txt"))) {
            oos.writeObject(car);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\TechMeSkill\\Java\\Task\\AN16TMS2022\\Lesson12\\src\\main\\java\\by\\tms\\task4\\output.txt"))) {
            Car car1 = (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
