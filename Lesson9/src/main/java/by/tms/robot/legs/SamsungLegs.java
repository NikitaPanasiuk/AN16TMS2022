package by.tms.robot.legs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SamsungLegs implements ILeg {
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Samsung leg done step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
