package by.tms.square;

public class Rectangle extends Figure implements SquareAware {
    private final int firstSide;
    private final int secSide;

    public Rectangle(int firstSide, int secSide) {
        this.firstSide = firstSide;
        this.secSide = secSide;
    }

    @Override
    Type getType() {
        return Type.RECTANGLE;
    }

    @Override
    public double getSquare() {
        return firstSide * secSide;
    }
}
