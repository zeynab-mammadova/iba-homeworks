package homeworks.homework12.entities;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private int iq;
    private Map<String, String> schedule;
    private Family family;


    Human(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    Human(String name, String surname, LocalDate birthDate, int iq, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.family = family;
    }

    Human(String name, String surname, LocalDate birthDate, int iq, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
    }
    Human(String name, String surname, LocalDate birthDate, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human(String name, String surname, LocalDate birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public Human(String name, String surname, LocalDate birthDate, Family family){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.family = family;
    }

    void greetPet(){
         System.out.println("Hello");
     }
     void describeAge(){
         LocalDate now= LocalDate.now();
         Period life = Period.between(birthDate, now);
     System.out.println(String.format("%d years, %d months, %d days", life.getYears(),life.getMonths(), life.getDays()));
    }
    String getName() {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
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
        return birthDate == human.birthDate &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(family, human.family);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq,family);
    }

    @Override
    public String toString() {
        return "Human:" +
                "name:"+name+","+
                "surname:"+surname+","+
                "birthDate:" + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +","+
                "iq:"+iq+","+
                "schedule:"+schedule;
    }

    @Override
    protected void finalize() {
        System.out.println("Removal of object");
    }
}


