package by.tms.dress;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private GucciJacket jacket;
    private GucciBoots boots;
    private GucciPants pants;

    public Person(GucciJacket jacket, GucciBoots boots, GucciPants pants) {
        this.jacket = jacket;
        this.boots = boots;
        this.pants = pants;
    }

    public void up() {
        jacket.up();
        boots.up();
        pants.up();
    }

    public void down() {
        jacket.down();
        boots.down();
        pants.down();
    }
}
