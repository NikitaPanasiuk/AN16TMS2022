package by.tms.task4;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class GasTank implements Serializable {
    final private String fuelType;
    final private String volume;

    public GasTank(String fuelType, String volume) {
        this.fuelType = fuelType;
        this.volume = volume;
    }
}
