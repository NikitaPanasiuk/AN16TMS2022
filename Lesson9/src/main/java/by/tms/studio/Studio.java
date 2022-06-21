package by.tms.studio;

public class Studio {
    public Dress[] dress;

    public Studio(Dress[] dress) {
        this.dress = dress;
    }


    public void dressUpMan() {
        for (Dress value : dress) {
            if (value.getType() == Type.Men) {
                System.out.println(value.getColor() + " " + value.getCost() + " " + value.getSize() + " " + value.getType());
            }
        }
    }


    public void dressUpWoman() {
        for (Dress value : dress) {
            if (value.getType() == Type.Women) {
                System.out.println(value.getColor() + " " + value.getCost() + " " + value.getSize() + " " + value.getType());
            }
        }
    }
}
