package by.tms.robot.hands;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SamsungHands implements IHand {
    private int prise;

    public SamsungHands(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung hand is upd");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
