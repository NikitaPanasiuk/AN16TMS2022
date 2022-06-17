package by.tms.transport;

public class Civil extends Air {
    private final int passNum;
    private final boolean isBusiness;

    public Civil(int power, int maxSpeed, int mass, String model, int wingSpan, int minRunWayLenForTakeOff, int passNum, boolean isBusiness) {
        super(power, maxSpeed, mass, model, wingSpan, minRunWayLenForTakeOff);
        this.passNum = passNum;
        this.isBusiness = isBusiness;
    }

    @Override
    public int getPower() {
        return (int) (super.getPower() * 0.74);
    }

    public void getDes() {
        System.out.println(getPower() + " is power of transport, " + getMaxSpeed() + " is max speed, " +
                getMass() + " is mass, " + getModel() + " is model, " + getWingSpan() + " is wing span, " +
                getMinRunWayLenForTakeOff() + " is min runway for take off, " + passNum + " is pas num, " + "business is" + isBusiness);
    }

    public void isPosToDownload(int pasNum) {
        if (passNum > pasNum) {
            System.out.println("airplane is load up");
        } else {
            System.out.println("You need bigger airplane");
        }
    }
}
