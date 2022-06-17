package by.tms.transport;

public class Cargo extends Ground {
    private final int loadCap;

    public Cargo(int power, int maxSpeed, int mass, String model, int numOfWheels, int fuelCons, int loadCap) {
        super(power, maxSpeed, mass, model, numOfWheels, fuelCons);
        this.loadCap = loadCap;
    }

    @Override
    public int getPower() {
        return (int) (super.getPower() * 0.74);
    }

    public void getDes() {
        System.out.println(getPower() + " is power of transport, " + getMaxSpeed() + " is max speed, " +
                getMass() + " is mass, " + getModel() + " is model, " + getNumOfWheels() + " is num of wheels, " +
                getFuelCons() + " is fuel consume for 100 km, " + loadCap + " is load capture ");
    }

    public void isPosToDownload(int mass) {
        if (loadCap > mass) {
            System.out.println("Track is load up");
        } else {
            System.out.println("You need bigger track");
        }
    }

}
