package homeworks.homework6;

import java.util.Objects;

public class Pet {


    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello owner. I am " + this.nickname + " I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }


    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }


    public String toString() {
        return getSpecies() + "{nickname= " + getNickname() + ", age= " + getAge() + ", trickLevel= " + getTrickLevel() + ", habits= " + getHabits() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return this.getSpecies() == pet.getSpecies() &&
                this.getNickname().equals(pet.getNickname()) &&
                this.getAge() == pet.getAge() &&
                this.getTrickLevel() == pet.getTrickLevel();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Pet class: " + this);
    }
}

