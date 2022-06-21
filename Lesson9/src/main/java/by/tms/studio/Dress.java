package by.tms.studio;

public abstract class Dress {
    private Size size;
    private String color;
    private int cost;

    private Type type;

    public Dress(Size size, String color, int cost, Type type) {
        this.size = size;
        this.color = color;
        this.cost = cost;
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}
