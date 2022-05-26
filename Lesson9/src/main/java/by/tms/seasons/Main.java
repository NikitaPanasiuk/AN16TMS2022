package by.tms.seasons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Season.values().length; i++) {
            System.out.println(Season.values()[i].info);
            System.out.println(Season.values()[i].aveTemp);
            System.out.println(getDescription(Season.values()[i]));
        }
        String favorite = in.next();
        System.out.println("input you favorite season");
        Season.showFavorite(Season.valueOf(favorite));

    }

    enum Season {
        SUMMER(28, "Summer is good and hot"),
        AUTUMN(15, "Autumn is good and beautiful"),
        WINTER(-4, "Winter is good and cold"),
        SPRING(19, "Spring is good and amazing");
        private final int aveTemp;
        private final String info;

        Season(int aveTemp, String info) {
            this.aveTemp = aveTemp;
            this.info = info;

        }

        public static void showFavorite(Season favorite) {
            System.out.println("i love" + favorite.info);
        }
    }


    public static String getDescription(Season seasons) {
        if (seasons == Season.SUMMER) {
            return "Hot season";
        }
        return "Cold season";
    }
}
