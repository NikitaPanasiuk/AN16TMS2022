package by.tms.car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String name;
    private int speed;
    private int cost;

    public Car(String name, int speed, int cost) {
        this.name = name;
        this.speed = speed;
        this.cost = cost;
    }

    public Car() {
    }

    public void start() throws IfEngineNotStart {
        int i = (int) (Math.random() * 21);
        if (i % 2 == 0) {
            System.out.println("Car" + name + " started!");
        } else {
            throw new IfEngineNotStart("Check engine!");
        }
    }
}
