package by.tms.flowerMarket;

public class Flower {
    String name;
    int cost;

    Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /* зачем тут гетеры и сетеры?
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }*/
    public String toString() {
        return "by.tms.flowerMarket.Flower" +
                " name is " + name +
                ", cost " + cost;
    }
}
