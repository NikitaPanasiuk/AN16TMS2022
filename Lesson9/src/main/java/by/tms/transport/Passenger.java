package by.tms.transport;

public class Passenger extends Ground {
    private final int pasNum;
    private final String bodyType;

    public Passenger(int power, int maxSpeed, int mass, String model, int numOfWheels, int fuelCons, int pasNum, String bodyType) {
        super(power, maxSpeed, mass, model, numOfWheels, fuelCons);
        this.pasNum = pasNum;
        this.bodyType = bodyType;
    }

    @Override
    public int getPower() {
        return (int) (super.getPower() * 0.74);
    }

    public void getDes() {
        System.out.println(getPower() + " is power of transport, " + getMaxSpeed() + " is max speed, " +
                getMass() + " is mass, " + getModel() + " is model, " + pasNum + " is pas num, " + getNumOfWheels() + " is num of wheels, " +
                getFuelCons() + " is fuel consume for 100 km, " + bodyType + " is body type ");
    }

    public void getDis(double time) {
        double dis = time * getMaxSpeed();
        System.out.println("For time " + time + " h, auto " + getModel() + " moving at maximum speed " + getMaxSpeed() +
                " km/h " + " gone " + dis + " km" + " fuel consumption will be " + getFuel(time) + " l");
    }

    private double getFuel(double time) {
        double dis = time * getMaxSpeed();
        return getFuelCons() * dis / 100;
    }
}
