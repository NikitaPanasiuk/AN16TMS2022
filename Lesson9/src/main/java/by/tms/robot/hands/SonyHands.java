package by.tms.robot.hands;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SonyHands implements IHand {
    private int prise;

    public SonyHands(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Sony hand is upd");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
