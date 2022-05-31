package by.tms.square;

import lombok.Getter;


public class Triangle extends Figure implements SquareAware {
    private final int high;
    private final int base;

    public Triangle(int high, int base) {
        this.high = high;
        this.base = base;
    }

    @Override
    Type getType() {
        return Type.TRIANGLE;
    }


    @Override
    public double getSquare() {
        return high * base * 0.5;
    }
}
