package by.tms.square;

import lombok.Getter;

@Getter
public class Line extends Figure {
    private final int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    Type getType() {
        return Type.LINE;
    }

}
