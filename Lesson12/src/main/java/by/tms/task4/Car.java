package by.tms.task4;

import java.io.Serializable;

public class Car implements Serializable {
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

    @Override
    public String toString() {
        return engene.getEngineType() + gasTank.getFuelType() + gasTank.getVolume() + name + speed + cost;
    }
}
