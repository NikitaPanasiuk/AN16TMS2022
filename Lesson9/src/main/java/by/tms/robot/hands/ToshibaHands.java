package by.tms.robot.hands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToshibaHands implements IHand {
    private int prise;

    public ToshibaHands(int prise) {
        this.prise = prise;
    }

    @Override
    public void upHand() {
        System.out.println("Toshiba hand is upd");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
