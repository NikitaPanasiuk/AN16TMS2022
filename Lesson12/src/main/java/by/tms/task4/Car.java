package by.tms.task4;

public class Car {
    final private Engine engene;
    final private GasTank gasTank;
    final private String name;
    final private String speed;
    final private String cost;

    public Car(Engine engene, GasTank gasTank, String name, String speed, String cost) {
        this.engene = engene;
        this.gasTank = gasTank;
        this.name = name;
        this.speed = speed;
        this.cost = cost;
    }

}
