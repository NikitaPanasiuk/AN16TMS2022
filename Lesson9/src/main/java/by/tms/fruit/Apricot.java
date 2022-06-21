package by.tms.fruit;

public class Apricot extends Fruit {
    public Apricot(int mass, int cost, Type type) {
        super(mass, cost, type);
    }

    @Override
    int showFinalCost() {
        return getCost() * getMass();
    }

}
