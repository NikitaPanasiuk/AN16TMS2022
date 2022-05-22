package by.tms.instrument;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Instrument[] instrument = new Instrument[3];
        for (int i = 0; i < instrument.length; i++) {
            System.out.println("input type of instrument");
            instrument[i] = createInstrument(Instrument.Type.valueOf(in.next()));
        }
        for (Instrument value : instrument) {
            value.play();

        }
    }

    public static Instrument createInstrument(Instrument.Type type) {
        Scanner in = new Scanner(System.in);
        if (type == Instrument.Type.GUITAR) {
            System.out.println("input num of string");
            return new Guitar(in.next());
        } else if (type == Instrument.Type.DRUMMER) {
            System.out.println("input size of drummer");
            return new Drummers(in.next());
        } else if (type == Instrument.Type.TRUMPET) {
            System.out.println("input diameter of trumpet");
            return new Trumpet(in.next());
        }
        System.out.println("Wrong type of instrument!");
        return createInstrument(type);
    }
}


