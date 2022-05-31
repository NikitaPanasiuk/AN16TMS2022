package by.tms.square;

public class Main {
    public static void main(String[] args) {
        Figure[] array = {new Triangle(10, 20), new Rectangle(10, 15), new Line(13)};
        for (Figure figure : array) {
            switch (figure.getType()) {
                case RECTANGLE -> System.out.println("Square of rec is " + ((Rectangle) figure).getSquare());
                case LINE -> System.out.println("Sq can't be found");
                case TRIANGLE -> System.out.println("Square of triangle is " + ((Triangle) figure).getSquare());
            }

        }
    }
}

