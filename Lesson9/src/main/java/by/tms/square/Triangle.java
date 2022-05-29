package by.tms.square;


public class Triangle extends Figure {
    public Triangle(Type type) {
        super(type);
    }

    @Override
    Type getType() {
        return null;
    }

    public void findSquare() {
        double p = (double) (Type.TRIANGLE.trainFirstSide + Type.TRIANGLE.trainSecSide + Type.TRIANGLE.trainThirdSide) / 2;
        double sq = Math.sqrt(p * (p - Type.TRIANGLE.trainFirstSide) * (p - Type.TRIANGLE.trainSecSide) * (p - Type.TRIANGLE.trainThirdSide));
        System.out.println("Square of triangle is " + sq);
    }
}
