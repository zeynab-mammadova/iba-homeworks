package homeworks.homework5;

import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq; // in this interval(1-100)
    private Family family;
    private String[][] schedule = new String[7][2];
    Random random = new Random();

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;

    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getShedule() {
        return schedule;
    }

    public void setShedule(String[][] shedule) {
        this.schedule = shedule;
    }

    public void welcomeTheFavorite() {
        System.out.println("Hello, " + this.family.getPet().getNickname());

    }

    public void describeTheFavourite() {
        System.out.print("I have " + this.family.getPet().getSpecies() + ", he is " + this.family.getPet().getAge() + " years old. ");
        if (this.family.getPet().getTrickLevel() < 50) System.out.println("He is almost not sly");
        else System.out.println("He is sly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return  this.getIq()==human.getIq()&&
                this.getYear()==human.getYear()&&
                this.getName().equals(human.getName()) &&
                this.getSurname().equals(human.getSurname()) ;
    }

        @Override
    public int hashCode() {
       return  Objects.hash(name, surname, family);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }

    public boolean feedPet(boolean feedTime) {
        if (feedTime || random.nextInt() < this.family.getPet().getTrickLevel()) {
            System.out.println("Hm... I will feed " + this.family.getPet().getNickname() + "");
            return true;
        } else {
            System.out.println("I think " + this.family.getPet().getNickname() + " is not hungry.");
            return false;
        }
    }
}