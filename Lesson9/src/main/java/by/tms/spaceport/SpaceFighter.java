package by.tms.spaceport;

public class SpaceFighter implements IStart {
    public boolean checkSystem() {
        int x = (int) (Math.random() * 11);
        return x > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Engine of space Fighter started");
    }

    @Override
    public void start() {
        System.out.println("Start of space Fighter");
    }
}
