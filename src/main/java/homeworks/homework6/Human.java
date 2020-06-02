package homeworks.homework6;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][]schedule;
    private Family family;

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }
    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public void welcomeTheFavorite() {
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describeTheFavourite() {
        System.out.println("I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is " + ((family.getPet().getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
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

    public void setIq(short iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return  this.getName().equals(human.getName()) &&
                this.getSurname().equals(human.getSurname()) &&
                this.getFamily().equals(human.getFamily());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getYear());
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
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Human class:" + this);
    }

}
