package by.tms.task4;

import lombok.Getter;

import java.io.Serializable;

@Getter

public class Engine implements Serializable {
    final private transient int numOfCylinders;
    final private String engineType;

    public Engine(int numOfCylinders, String engineType) {
        this.numOfCylinders = numOfCylinders;
        this.engineType = engineType;
    }
}
