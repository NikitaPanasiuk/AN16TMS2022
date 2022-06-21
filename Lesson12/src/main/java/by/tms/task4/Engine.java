package by.tms.task4;

public class Engine {
    final private transient int numOfCylinders;
    final private String engineType;

    public Engine(int numOfCylinders, String engineType) {
        this.numOfCylinders = numOfCylinders;
        this.engineType = engineType;
    }
}
