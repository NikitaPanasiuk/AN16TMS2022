package by.tms.seasons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showFavorite(Seasons.valueOf(in.next()));
        for (int i = 0; i < Seasons.values().length; i++) {
            System.out.println(Seasons.values()[i].info);
            System.out.println(Seasons.values()[i].aveTemp);
            System.out.println(getDescription(Seasons.values()[i]));
        }

    }

    enum Seasons {
        SUMMER(28, "Summer is good and hot"),
        AUTUMN(15, "Autumn is good and beautiful"),
        WINTER(-4, "Winter is good and cold"),
        SPRING(19, "Spring is good and amazing");
        private final int aveTemp;
        private final String info;

        Seasons(int aveTemp, String info) {
            this.aveTemp = aveTemp;
            this.info = info;
        }
    }

    public static void showFavorite(Seasons favorite) {
        switch (favorite) {
            case SUMMER -> System.out.println("I love summer " + Seasons.SUMMER.info);
            case AUTUMN -> System.out.println("I love autumn " + Seasons.AUTUMN.info);
            case WINTER -> System.out.println("I love winter " + Seasons.WINTER.info);
            case SPRING -> System.out.println("I love spring " + Seasons.SPRING.info);
        }
    }

    public static String getDescription(Seasons seasons) {
        if (seasons == Seasons.SUMMER) {
            return "Hot season";
        }
        return "Cold season";
    }
}
