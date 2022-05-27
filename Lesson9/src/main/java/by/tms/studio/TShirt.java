package by.tms.studio;

public class TShirt extends Dress implements WomanDress, MenDress {

    public TShirt(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpMen() {
        System.out.println("Man t-shirt, color is = " + getColor() + ", europe size is = " + getSize() + ", price is = " + getCost());

    }

    @Override
    public void dressUpWoman() {
        System.out.println("Woman t-shirt, color is = " + getColor() + ", europe size is = " + getSize() + ", price is = " + getCost());

    }
}
