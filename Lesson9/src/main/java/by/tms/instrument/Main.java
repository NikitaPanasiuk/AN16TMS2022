package by.tms.instrument;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("input num of instruments");
        int n = in.nextInt();
        Instrument[] instrument = new Instrument[n];
        for (int i = 0; i < instrument.length; i++) {
            System.out.println("input type of instrument");
            instrument[i] = createInstrument(Instrument.Type.valueOf(in.next()));
        }
        for (Instrument value : instrument) {
            value.play();

        }
    }

    public static Instrument createInstrument(Instrument.Type type) {
        switch (type) {
            case GUITAR -> {
                System.out.println("input num of string");
                return new Guitar(in.next());
            }
            case DRUMMER -> {
                System.out.println("input size of drummer");
                return new Drummers(in.next());
            }
            case TRUMPET -> {
                System.out.println("input diameter of trumpet");
                return new Trumpet(in.next());
            }
        }
        return null;
    }
}


