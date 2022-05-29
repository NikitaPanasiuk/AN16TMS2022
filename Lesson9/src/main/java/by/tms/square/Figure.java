package by.tms.square;

public abstract class Figure {
    private Type type;

    public Figure(Type type) {
        this.type = type;
    }

    abstract Type getType();
}
