package by.tms.flowerMarket;

public class Bouquet {
    Flower[] bouquet;

    Bouquet(Flower[] bouquet) {
        this.bouquet = bouquet;
    }

    public void findCost() {
        int finalCost = 0;
        for (Flower flower : bouquet) {
            finalCost += flower.cost;
        }
        System.out.println("cost of bouquet is" + finalCost);
    }

}
