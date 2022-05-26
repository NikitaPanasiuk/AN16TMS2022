package by.tms.studio;

public class Pants extends Dress implements WomanDress, MenDress {
    public Pants(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpMen() {
        System.out.println("Man pants, color is = " + getColor() + ", europe size is = " + getSize() + ", price is = " + getCost());

    }

    @Override
    public void dressUpWoman() {
        System.out.println("Woman pants, color is = " + getColor() + ", europe size is = " + getSize() + ", price is = " + getCost());

    }
}
