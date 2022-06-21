package by.tms.spaceport;

public class SpaceShip implements IStart {
    @Override
    public boolean checkSystem() {
        int x = (int) (Math.random() * 11);
        return x > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Engine of space ship started");
    }

    @Override
    public void start() {
        System.out.println("Start of space ship");
    }
}
