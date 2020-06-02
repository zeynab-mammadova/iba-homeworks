package homeworks.homework11.App;

import java.util.ArrayList;
import java.util.Map;

public class Woman extends Human {

    public Woman(String name, String surname, long year, Family family) {
        super(name, surname, year, family);
    }

    public Woman(String name, String surname, long year, Pet pet, Family family, Map<String, ArrayList<String>> schedule) {
        super(name, surname, year, pet, family, schedule);
    }

    public Woman(String name, String surname, String birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }
    public void makeupLove(String makeup){
        System.out.printf("My favourite %s\n brand is Zoeva", makeup );
    }
}
