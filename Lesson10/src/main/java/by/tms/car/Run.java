package by.tms.car;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 280, 10000);
        Car car2 = new Car("Toyota", 260, 5000);
        Car car3 = new Car("Honda", 280, 7000);
        try {
            car1.start();
        } catch (IfEngineNotStart e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (IfEngineNotStart e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (IfEngineNotStart e) {
            System.out.println(e.getMessage());
        }
    }
}
