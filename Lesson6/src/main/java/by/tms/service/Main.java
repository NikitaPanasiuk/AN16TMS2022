package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel core i5", "HyperX 8GB", "Kingston 1000GB");
        //тут 2 варианта сделал чтобы программа не заканчивалась и объект не пересоздавался
       /*for (int i = 0; i < 6; i ++){
            computer1.getInf();
            computer1.computerOn();
        }*/
        do {
            computer1.getInf();
            computer1.computerOn();
        } while (!computer1.isBurned);
    }
}
