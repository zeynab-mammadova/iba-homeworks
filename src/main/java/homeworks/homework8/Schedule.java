package homeworks.homework8;

import java.util.HashMap;

public class Schedule {
    private HashMap<String, Integer> schedule= new HashMap<>();



    public HashMap<String, Integer> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String, Integer> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + schedule +
                '}';
    }
}

