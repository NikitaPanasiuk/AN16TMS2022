package by.tms.studio;

public class Tie extends Dress implements MenDress {
    public Tie(Size size, String color, int cost, Type type) {
        super(size, color, cost, type);
    }

    @Override
    public void dressUpMen() {

    }
}
