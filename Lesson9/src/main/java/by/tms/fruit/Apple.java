package by.tms.fruit;

public class Apple extends Fruit {

    public Apple(int mass, int cost, Type type) {
        super(mass, cost, type);
    }

    @Override
    int showFinalCost() {
        return getMass() * getCost();
    }
}
