public class Car {
    private String model;
    GasTank gasTank;
    Engine engine;
    int mileage;

    public void setModel(String model) {
        this.model = model;
    }

    boolean isStart = false;

    Car(GasTank gasTank, Engine engine) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void showModel() {
        System.out.println(model);
    }

    public void startCar() {
        if (gasTank.getFuelQuantity() > 0) {
            engine.turnOnEngine();
            isStart = true;
            System.out.println("Car started");
        } else {
            System.out.println("Gas tank empty!");
        }
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void rideCar() {
        if (engine.isOn) {
            this.mileage += 15;
            System.out.println("The car went...");
        } else {
            System.out.println("Engine off!");
        }
    }


    public void turnOffTheCar() {
        isStart = false;
        System.out.println("Car turned off");
    }

    public void showMileage() {
        System.out.println("Mileage is " + mileage);
    }

    public void showFuelQuantity() {
        System.out.println(gasTank.getFuelQuantity());

    }

    public void gasUp(int fuel) {
        if (gasTank.getVolume() >= fuel) {
            gasTank.setFuelQuantity(fuel);
        } else {
            System.out.println("To much fuel!");
        }
    }
}
