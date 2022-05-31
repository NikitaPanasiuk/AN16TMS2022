package by.tms.robot;

import by.tms.robot.hands.SonyHands;
import by.tms.robot.hands.ToshibaHands;
import by.tms.robot.heads.SamsungHead;
import by.tms.robot.heads.SonyHead;
import by.tms.robot.heads.ToshibaHead;
import by.tms.robot.legs.SamsungLegs;
import by.tms.robot.legs.ToshibaLegs;

public class Run {
    public static void main(String[] args) {
        Robot[] array = {new Robot(new SamsungHead(14), new ToshibaHands(18), new ToshibaLegs(19)),
                new Robot(new SonyHead(19), new SonyHands(21), new SamsungLegs(19)),
                new Robot(new ToshibaHead(14), new SonyHands(18), new ToshibaLegs(19))
        };
        int max = array[0].getPrice();
        int i1 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i].action();
            if (array[i].getPrice() > max) {
                max = array[i].getPrice();
                i1 = i;
            }
        }
        System.out.println("Most expensive robot is robot" + i1);
    }
}

