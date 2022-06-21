public class GasTank {
    private int volume;
    private int fuelQuantity = 0;

    public int getVolume() {
        return volume;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
