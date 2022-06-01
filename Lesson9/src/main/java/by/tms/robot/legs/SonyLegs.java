package by.tms.robot.legs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SonyLegs implements ILeg {
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Sony leg done step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
