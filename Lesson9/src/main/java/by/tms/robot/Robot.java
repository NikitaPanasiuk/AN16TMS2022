package by.tms.robot;

import by.tms.robot.hands.IHand;
import by.tms.robot.heads.IHead;
import by.tms.robot.legs.ILeg;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }


}
