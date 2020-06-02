package homeworks.homework8;

import java.util.*;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<String, ArrayList<String>> schedule = new HashMap<>();
    private Family family;
    private Pet pet;
    Random random = new Random();
    public Human(String name, String surname, int year, int iq, Map<String, ArrayList<String>> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq=iq;
    }


    public Human(String name, String surname, int year, Map<String, ArrayList<String>> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }
    public Human() {}

    public void welcomeTheFavorite() {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describeTheFavourite() {
        System.out.println("I have a " + family.getPet() + ", he is " + pet.getAge() + " years old, he is " + ((pet.getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
    }

    public boolean feedPet(boolean feedTime) {
        if (feedTime || random.nextInt() < pet.getTrickLevel()) {
            System.out.println("Hm... I will feed " + pet.getNickname() + "");
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
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
    public Map<String, ArrayList<String>> getSchedule() {
        return schedule;
    }
    public void setSchedule( Map<String, ArrayList<String>> schedule) {
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
                ", iq=" + iq +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Human class:" + this);
    }

}
