package by.tms.studio;

public class Studio {

    public Studio(Dress[] dress) {
    }


    public void dressUpMan(Dress[] dress) {
        for (Dress value : dress) {
            if (value.getType() == Type.Men) {
                System.out.println(value.getColor() + " " + value.getCost() + " " + value.getSize() + " " + value.getType());
            }
        }
    }


    public void dressUpWoman(Dress[] dress) {
        for (Dress value : dress) {
            if (value.getType() == Type.Women) {
                System.out.println(value.getColor() + " " + value.getCost() + " " + value.getSize() + " " + value.getType());
            }
        }
    }
}
