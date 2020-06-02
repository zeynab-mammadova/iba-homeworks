package homeworks.homework13.entities;

import java.io.Serializable;

public class Dog extends Pet implements Foulable, Serializable {
    public Dog(Species species, String nickname, int age, int trickLevel) {
        super(species, nickname, age, trickLevel);
    }

    @Override
    void respond() {
        System.out.println("Hey");
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
