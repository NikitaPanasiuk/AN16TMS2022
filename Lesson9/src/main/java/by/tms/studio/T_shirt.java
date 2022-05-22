package by.tms.studio;

public class T_shirt extends Dress implements WomanDress, MenDress {

    public T_shirt(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpMen() {

    }

    @Override
    public void dressUpWoman() {

    }
}
