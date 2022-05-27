package by.tms.instrument;

public class Guitar implements Instrument {
    private final String numOfString;

    Guitar(String numOfString) {
        this.numOfString = numOfString;
    }

    @Override
    public void play() {
        System.out.println("Play guitar with " + numOfString + " strings");
    }
}
