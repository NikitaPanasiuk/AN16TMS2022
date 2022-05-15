import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("create a gas tank");
        GasTank gasTank = new GasTank();
        Scanner in = new Scanner(System.in);
        System.out.println("Input gas tank volume");
        int n = in.nextInt();
        gasTank.setVolume(n);
        System.out.println("create an engine");
        Engine engine = new Engine();
        System.out.println("input type of engine");
        String type = in.next();
        engine.setType(type);
        Car car1 = new Car(gasTank, engine);
        System.out.println("Input mileage of car");
        int x = in.nextInt();
        car1.setMileage(x);
        System.out.println("Input model of car");
        String model = in.next();
        car1.setModel(model);
        System.out.println("Gas up a car");
        int fuel = in.nextInt();
        car1.gasUp(fuel);
        car1.startCar();
        car1.rideCar();
        car1.turnOffTheCar();
        car1.showMileage();
        car1.showFuelQuantity();
        car1.showModel();
    }
}
