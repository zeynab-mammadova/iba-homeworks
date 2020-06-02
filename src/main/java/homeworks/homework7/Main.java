package homeworks.homework7;

public class Main {
    public static void main(String[] args) {

        Human Michael = new Human("Michael", "Karoline", 1975);
        Human Laura = new Human("Laura", "Karoline", 1975);
        Human John = new Human("John", "Bravo", 2004);
        Human Rose = new Human("Rose", "Bravo", 2006);
        DomesticCat cat = new DomesticCat( "Meowchik", 2, 65, new String[]{"running,sleeping"});
        cat.setSpecies(Species.DOMESTICCAT);
        String[][] planner = {{DayOfWeek.SUNDAY.name(), "Read book"}, {DayOfWeek.MONDAY.name(), "Go to the IBA"},
                {DayOfWeek.TUESDAY.name(), "Go to the museum"}, {DayOfWeek.WEDNESDAY.name(), "Go to the IBA"},
                {DayOfWeek.THURSDAY.name(), "Do homework"}, {DayOfWeek.FRIDAY.name(), "Go to the IBA"},
                {DayOfWeek.SATURDAY.name(), "Sleep"},
        };
        Schedule schedule = new Schedule(planner);
        Schedule table = new Schedule(planner);
        Family family = new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(cat);
        family.deleteChild(1);
        System.out.println("Number of family members: " + family.countFamily());
        System.out.println("Family members: ");
        System.out.println(family.toString());


    }

}