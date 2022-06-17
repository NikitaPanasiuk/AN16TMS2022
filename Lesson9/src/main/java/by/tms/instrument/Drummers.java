package by.tms.instrument;

public class Drummers implements Instrument {
    private final String size;

    Drummers(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play drummers with " + size + " size ");
    }

}
