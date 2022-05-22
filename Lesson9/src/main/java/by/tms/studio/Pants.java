package by.tms.studio;

public class Pants extends Dress implements WomanDress, MenDress {
    public Pants(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpMen() {

    }

    @Override
    public void dressUpWoman() {

    }
}
