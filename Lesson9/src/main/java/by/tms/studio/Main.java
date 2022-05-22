package by.tms.studio;

public class Main {
    public static void main(String[] args) {
        Skirt skirt = new Skirt(Size.XS, "Black", 134, Type.Women);
        T_shirt t_shirt = new T_shirt(Size.M, "Red", 144, Type.Men);
        Tie tie = new Tie(Size.M, "Black", 99, Type.Men);
        Pants pants = new Pants(Size.L, "Brown", 210, Type.Women);
        Dress[] dress = {skirt, t_shirt, tie, pants};
        Studio studio = new Studio(dress);
        studio.dressUpMan(dress);
        studio.dressUpWoman(dress);
        for (int i = 0; i < Size.values().length; i++) {
            System.out.println(Size.values()[i].getDescription(Size.values()[i]));
        }
    }
}
