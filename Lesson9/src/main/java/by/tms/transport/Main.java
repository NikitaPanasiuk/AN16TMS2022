package by.tms.transport;

public class Main {
    public static void main(String[] args) {
        Transport car = new Passenger(200, 260, 1000, "BMW", 4, 13, 6, "X6");
        ((Passenger) car).getDes();
        ((Passenger) car).getDis(2.5);
        Transport airplane = new Civil(1000, 800, 4000, "Boing", 17, 1000, 200, true);
        Transport track = new Cargo(500, 160, 5000, "Scania", 4, 13, 6);
        Transport fighter = new Military(10000, 3500, 4000, "F16", 17, 1000, true, 10);
        ((Civil) airplane).getDes();
        ((Civil) airplane).isPosToDownload(150);
        ((Cargo) track).getDes();
        ((Cargo) track).isPosToDownload(100);
        ((Military) fighter).getDes();
        ((Military) fighter).catap();
        ((Military) fighter).shoot();
    }
}
