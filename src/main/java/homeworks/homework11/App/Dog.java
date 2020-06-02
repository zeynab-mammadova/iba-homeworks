package homeworks.homework11.App;

import java.util.Random;
import java.util.Set;

public class Dog extends Pet {
    private Random rand = new Random();
private Species spec= Species.DOG;

    public Dog(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public Dog(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        species = spec;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public Dog() {
        this(Species.UNKNOWN, "Dog", 60);
    }

    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Oops..");
    }

    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "spec=" + spec +
                '}';
    }
}
