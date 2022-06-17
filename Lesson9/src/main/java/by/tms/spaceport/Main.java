package by.tms.spaceport;

public class Main {
    public static void main(String[] args) {
        SpacePort spacePort = new SpacePort();
        spacePort.start(new SpaceFighter());
        spacePort.start(new SpaceShip());
        spacePort.start(new StarOfDeath());
    }
}
