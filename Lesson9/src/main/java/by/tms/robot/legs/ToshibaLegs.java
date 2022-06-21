package by.tms.robot.legs;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ToshibaLegs implements ILeg {
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Toshiba leg done step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
