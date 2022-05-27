package by.tms.instrument;

public class Trumpet implements Instrument {
    private final String diameter;

    Trumpet(String diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Play trumpet with " + diameter + " diameter");
    }
}
