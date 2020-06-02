package homeworks.homework6;

public class Main {
    public static void main(String[] args) {

        Human Michael = new Human("Michael", "Karoline", 1975, 90);
        Human Laura = new Human("Laura", "Karoline", 1975, 93);
        Human John = new Human("John", "Bravo", 2004, 88);
        Human Rose = new Human("Rose", "Bravo", 2006, 90);
        Pet hamster = new Pet(Species.HAMSTER, "Yulaf", 2, 40, new String[]{"eating,running,sleeping"});
        String[][] schedule = {{DayOfWeek.SUNDAY.name(), "Read book"}, {DayOfWeek.MONDAY.name(), "Go to the IBA"},
                {DayOfWeek.TUESDAY.name(), "Go to the museum"}, {DayOfWeek.WEDNESDAY.name(), "Go to the IBA"},
                {DayOfWeek.THURSDAY.name(), "Do homework"}, {DayOfWeek.FRIDAY.name(), "Go to the IBA"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
        };
        Schedule planner = new Schedule(schedule);
        Family family = new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(hamster);
        System.out.println("Number of family members: " + family.countFamily());
        System.out.println(family.toString());
        family.deleteChild(0);
        System.out.println("Number of family members after 1st child leave family: " + family.countFamily());
        System.out.println(family.toString());
        family.deleteChild(John);
        System.out.println("Number of family members after 2nd child leave family: " + family.countFamily());
        System.out.println(family.toString());

        for (int i = 0; i < 100000; i++) {
            new Human();
            System.gc();

        }
    }
}

