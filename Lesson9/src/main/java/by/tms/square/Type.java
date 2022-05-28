package by.tms.square;

import java.util.Scanner;

public enum Type {
    TRIANGLE(10, 10, 10), RECTANGLE(15, 14), LINE(13);
    int length;
    int recFirstSide;
    int recSecSide;
    int trainFirstSide;
    int trainSecSide;
    int trainThirdSide;

    Type(int length) {
        this.length = length;
    }

    ;

    Type(int recFirstSide, int recSecSide) {
        this.recFirstSide = recFirstSide;
        this.recSecSide = recSecSide;
    }

    Type(int trainFirstSide, int trainSecSide, int trainThirdSide) {
        this.trainFirstSide = trainFirstSide;
        this.trainSecSide = trainSecSide;
        this.trainThirdSide = trainThirdSide;

    }

}
