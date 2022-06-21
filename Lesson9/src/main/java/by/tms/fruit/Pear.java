package by.tms.fruit;

public class Pear extends Fruit {
    public Pear(int mass, int cost, Type type) {
        super(mass, cost, type);
    }

    @Override
    int showFinalCost() {
        return getCost() * getMass();
    }

}
