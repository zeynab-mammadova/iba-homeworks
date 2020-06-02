package homeworks.homework13.entities;

import java.io.Serializable;
import java.util.Set;

public class Fish extends Pet implements Serializable {
    Fish(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void respond() {
        System.out.println("Hey");
    }

    @Override
    void eat() {
        super.eat();
    }
}
