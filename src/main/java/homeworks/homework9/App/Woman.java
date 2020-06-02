package homeworks.homework9.App;

import java.util.ArrayList;
import java.util.Map;

public class Woman extends Human {

    public Woman(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Woman(String name, String surname, int year, Pet pet, Family family, Map<String, ArrayList<String>> schedule) {
        super(name, surname, year, pet, family, schedule);
    }
    public void makeupLove(String makeup){
        System.out.printf("My favourite %s\n brand is Zoeva", makeup );
    }
}
