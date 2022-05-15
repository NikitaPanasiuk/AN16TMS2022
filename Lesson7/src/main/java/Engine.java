public class Engine {
    private String type;
    boolean isOn = false;

    public void turnOnEngine() {
        isOn = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
