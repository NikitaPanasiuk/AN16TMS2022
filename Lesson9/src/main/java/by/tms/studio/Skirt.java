package by.tms.studio;

public class Skirt extends Dress implements WomanDress {
    public Skirt(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpWoman() {
        System.out.println("Woman skirt, color is = " + getColor() + ", europe size is = " + getSize() + ", price is = " + getCost());

    }
}
