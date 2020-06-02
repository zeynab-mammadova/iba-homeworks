package homeworks.homework4;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    String surname;
    int year;
    int iq; // in this interval(1-100)
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][2];
    Random random = new Random();
    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public void greatPet() {
        System.out.println("Hello " + this.pet.nickname);
    }

    public void describePet() {
        System.out.println("I have a " + pet.species + " ,he is " + pet.age + " years old, he is " + (this.pet.trickLevel > 50 ? "very sly" : "almost not sly"));
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                ", random=" + random +
                '}';
    }

    public boolean feedPet(boolean feedTime) {
        if (feedTime || random.nextInt() < this.pet.trickLevel) {
            System.out.println("Hm... I will feed " + this.pet.nickname + "");
            return true;
        } else {
            System.out.println("I think " + this.pet.nickname + " is not hungry.");
            return false;
        }
    }
}