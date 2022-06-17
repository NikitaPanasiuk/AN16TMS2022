package by.tms.flowerMarket;

public class FlowerMarket {
    public Bouquet getBouquet(String... flowers) {
        Flower[] bouquet = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < Constants.matrix.length; j++) {
                if ((Constants.matrix[j][0]).equals(flowers[i])) {
                    Flower flower = new Flower(Constants.matrix[j][0], Integer.parseInt(Constants.matrix[j][1]));
                    bouquet[i] = flower;
                }
            }
        }
        return new Bouquet(bouquet);
    }
}
