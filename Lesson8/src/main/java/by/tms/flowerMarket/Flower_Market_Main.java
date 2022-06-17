package by.tms.flowerMarket;

public class Flower_Market_Main {
    public static void main(String[] args) {
        FlowerMarket market1 = new FlowerMarket();
        Bouquet bouquet1 = market1.getBouquet("ROSE", "LILY", "ASTER", "ROSE");
        Bouquet bouquet2 = market1.getBouquet("ROSE", "ROSE", "ROSE", "ROSE");
        int numOfSold = bouquet2.bouquet.length + bouquet1.bouquet.length;
        System.out.println("num of sold flower is " + numOfSold);
        for (int i = 0; i < bouquet1.bouquet.length; i++) {
            System.out.println("bouquet 1 consist of " + bouquet1.bouquet[i].toString());
        }
        bouquet1.findCost();
        System.out.println();
        for (int i = 0; i < bouquet2.bouquet.length; i++) {
            System.out.println("bouquet 1 consist of " + bouquet2.bouquet[i].toString());
        }
        bouquet2.findCost();
    }
}
