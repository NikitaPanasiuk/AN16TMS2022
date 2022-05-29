package by.tms.square;

public class Rectangle extends Figure {
    public Rectangle(Type type) {
        super(type);
    }

    @Override
    Type getType() {
        return null;
    }

    public void findSquare() {
        double sq = Type.RECTANGLE.recFirstSide * Type.RECTANGLE.recSecSide;
        System.out.println("Square of rectangle is " + sq);
    }
}
