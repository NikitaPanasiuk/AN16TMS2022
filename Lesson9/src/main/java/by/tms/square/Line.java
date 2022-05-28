package by.tms.square;

public class Line extends Figure {
    public Line(Type type) {
        super(type);
    }

    @Override
    Type getType() {
        return null;
    }

    public void findSquare() {
        System.out.println("Square can't be find, length of line is ");
    }
}
