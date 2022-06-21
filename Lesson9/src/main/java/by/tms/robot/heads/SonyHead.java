package by.tms.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Say head Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
