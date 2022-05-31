package by.tms.transport;

public class Military extends Air {
    private final boolean isCatap;
    private final int rocketNum;

    public Military(int power, int maxSpeed, int mass, String model, int wingSpan, int minRunWayLenForTakeOff, boolean isCatap, int rocketNum) {
        super(power, maxSpeed, mass, model, wingSpan, minRunWayLenForTakeOff);
        this.isCatap = isCatap;
        this.rocketNum = rocketNum;
    }

    @Override
    public int getPower() {
        return (int) (super.getPower() * 0.74);
    }

    public void getDes() {
        System.out.println(getPower() + " is power of transport, " + getMaxSpeed() + " is max speed, " +
                getMass() + " is mass, " + getModel() + " is model, " + getWingSpan() + " is wing span, " +
                getMinRunWayLenForTakeOff() + " is min runway for take off, " + rocketNum + " is rocket num, " + "Catapult is " + isCatap);
    }

    public void shoot() {
        if (rocketNum > 0) {
            System.out.println("Rocket gone!");
        } else {
            System.out.println("ammo empty");
        }
    }

    public void catap() {
        if (isCatap) {
            System.out.println("The ejection was successful");
        } else {
            System.out.println("you don't have this system");
        }
    }
}
