package by.tms.fruit;

public abstract class Fruit {
    private final int mass;
    private final int cost;
    private final Type type;

    public Fruit(int mass, int cost, Type type) {
        this.mass = mass;
        this.cost = cost;
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public int getMass() {
        return mass;
    }

    public Type getType() {
        return type;
    }

    final void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    abstract int showFinalCost();
}
