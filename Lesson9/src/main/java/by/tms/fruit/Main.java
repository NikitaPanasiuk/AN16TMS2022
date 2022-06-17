package by.tms.fruit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input num of fruits");
        int n = in.nextInt();
        Fruit[] fruits = new Fruit[n];
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("input name of fruits");
            Type type = Type.valueOf(in.next());
            switch (type) {
                case Pear -> {
                    System.out.println("input mass and cost");
                    fruits[i] = new Pear(in.nextInt(), in.nextInt(), Type.Pear);
                }
                case Apple -> {
                    System.out.println("input mass and cost");
                    fruits[i] = new Apple(in.nextInt(), in.nextInt(), Type.Apple);
                }
                case Apricot -> {
                    System.out.println("input mass and cost");
                    fruits[i] = new Apricot(in.nextInt(), in.nextInt(), Type.Apricot);

                }
            }
        }
        int priceOfApple = 0, priceOfPear = 0, priceOfApricot = 0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == Type.Apple) {
                priceOfApple += fruit.showFinalCost();
            } else if (fruit.getType() == Type.Pear) {
                priceOfPear += fruit.showFinalCost();
            } else if (fruit.getType() == Type.Apricot) {
                priceOfApricot += fruit.showFinalCost();
            }
        }
        System.out.println("final cost of apple is " + priceOfApple + ", final cost of pear is " + priceOfPear + ", final price of apricot is " + priceOfApricot);
        int numOfApple = 0, numOfPear = 0, numOfApricot = 0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == Type.Apple) {
                numOfApple++;
            } else if (fruit.getType() == Type.Pear) {
                numOfPear++;
            } else if (fruit.getType() == Type.Apricot) {
                numOfApricot++;
            }
        }
        System.out.println("num of sold apple is " + numOfApple + ", num of sold pear is " + numOfPear + ", num of sold apricot is " + numOfApricot);

    }
}
