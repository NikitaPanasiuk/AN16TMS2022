package by.tms.transport;

import lombok.Getter;

@Getter
public abstract class Air extends Transport {
    private final int wingSpan;
    private final int minRunWayLenForTakeOff;

    public Air(int power, int maxSpeed, int mass, String model, int wingSpan, int minRunWayLenForTakeOff) {
        super(power, maxSpeed, mass, model);
        this.wingSpan = wingSpan;
        this.minRunWayLenForTakeOff = minRunWayLenForTakeOff;
    }
}
