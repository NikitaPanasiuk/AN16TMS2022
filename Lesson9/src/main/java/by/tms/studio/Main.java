package by.tms.studio;

public class Main {
    public static void main(String[] args) {
        Skirt skirt = new Skirt(Size.XS, "Black", 134, Type.Women);
        TShirt t_shirt = new TShirt(Size.M, "Red", 144, Type.Men);
        Tie tie = new Tie(Size.M, "Black", 99, Type.Men);
        Pants pants = new Pants(Size.L, "Brown", 210, Type.Women);
        Dress[] dress = {skirt, t_shirt, tie, pants};
        Studio studio = new Studio(dress);
        studio.dressUpMan();
        studio.dressUpWoman();
        for (int i = 0; i < Size.values().length; i++) {
            System.out.println(Size.values()[i].getDescription(Size.values()[i]));
        }
    }
}
