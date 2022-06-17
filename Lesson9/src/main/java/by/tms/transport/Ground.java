package by.tms.transport;

import lombok.Getter;

@Getter
public abstract class Ground extends Transport {
    private final int numOfWheels;
    private final int fuelCons;

    public Ground(int power, int maxSpeed, int mass, String model, int numOfWheels, int fuelCons) {
        super(power, maxSpeed, mass, model);
        this.numOfWheels = numOfWheels;
        this.fuelCons = fuelCons;
    }
}
