package by.tms.instrument;

public interface Instrument {
    public enum Type {GUITAR, DRUMMER, TRUMPET}

    String key = "C major";

    void play();
}
