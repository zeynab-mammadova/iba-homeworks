package homeworks.homework7;

import java.util.Arrays;

public class Schedule {
    private String[][] schedule;

    public Schedule(String[][] schedule){
        this.schedule=schedule;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
