package homeworks.homework10.App;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private Map<String, ArrayList<String>> schedule = new HashMap<>();
    private Family family;
    Random random = new Random();
    public Human(String name, String surname, long birthDate, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.family = family;
        if((family != null)) family.addChild(this);
    }

    public Human(String name, String surname, long birthDate, Pet pet, Family family, Map<String, ArrayList<String>> schedule) {
        this(name, surname, birthDate, family);
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthDate, int iq){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter).toEpochDay();
        this.iq = iq;
        this.name = name;
        this.surname = surname;
    }

    public void welcomeTheFavorite() {
        System.out.println("Hello, " +pet.getNickname());
    }

    public void describeTheFavourite() {
        System.out.println("I have a " + pet + ", he is " + pet.getAge() + " years old, he is " + ((pet.getTrickLevel() > 50) ? "Very sly" : "almost not sly"));
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

    public String getSurname() {
        return surname;
    }

    public long getYear() {
        return birthDate;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setYear(long birthDate) {
        this.birthDate = birthDate;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setIq() {
        this.iq = iq;
    }

    public void setSchedule(Map<String, ArrayList<String>> schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        if(family.equals(this.family)) return;
        if (this.family != null) this.family.deleteChild(this);
        this.family = family;
    }


    public String describeAge(){
        LocalDate date = LocalDate.ofEpochDay(birthDate);
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(date, localDate);
        return String.format("%d years, %d months, %d days old",
                period.getYears(),
                period.getMonths(),
                period.getDays());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return  Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getYear());
    }

    @Override
    public String toString() {
        String s = String.format("Human{name='%s', surname='%s', birth date=%s, iq=1, schedule=%s}",
                name,
                surname,
                LocalDate.ofEpochDay(birthDate).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                schedule.toString());

        return s;
    }
}
