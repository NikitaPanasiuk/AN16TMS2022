package by.tms.transport;

import lombok.Getter;


@Getter
public abstract class Transport {
    private final int power;
    private final int maxSpeed;
    private final int mass;
    private final String model;

    public Transport(int power, int maxSpeed, int mass, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.model = model;
    }
}
