package homeworks.homework9.App;

import java.util.ArrayList;
import java.util.Map;

public class Man extends Human {
    public Man(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Man(String name, String surname, int year, Pet pet, Family family, Map<String, ArrayList<String>> schedule) {
        super(name, surname, year, pet, family, schedule);
    }

    public void CarLove(String car){
        System.out.printf("I love %s, and my dream is to buy BMW \n", car );
    }
}
