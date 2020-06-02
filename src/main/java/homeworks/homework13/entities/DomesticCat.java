package homeworks.homework13.entities;

import java.io.Serializable;

public class DomesticCat extends Pet implements Foulable, Serializable {
    public DomesticCat(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel);
    }

    @Override
    void respond() {
        System.out.println("Hi");
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    public void foul(){
        System.out.println("Oops");
    }
}
