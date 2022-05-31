package by.tms.spaceport;

public class StarOfDeath implements IStart {
    public boolean checkSystem() {
        int x = (int) (Math.random() * 11);
        return x > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Engine of star of death started");
    }

    @Override
    public void start() {
        System.out.println("Start of star of death ship");
    }
}
