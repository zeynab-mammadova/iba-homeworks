package homeworks.homework7;

import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Schedule schedule;
    private Family family;
    Random random = new Random();


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human() {}

    public void welcomeTheFavorite() {
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describeTheFavourite() {
        System.out.println("I have a " + family.getPet() + ", he is " + family.getPet().getAge() + " years old, he is " + ((family.getPet().getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
    }

    public boolean feedPet(boolean feedTime) {
        if (feedTime || random.nextInt() < family.getPet().getTrickLevel()) {
            System.out.println("Hm... I will feed " + family.getPet().getNickname() + "");
            return true;
        } else {
            System.out.println("I think " + family.getPet().getNickname() + " is not hungry.");
            return false;
        }
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
    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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
        return getYear() == human.getYear() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname());
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
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Human class:" + this);
    }

}
