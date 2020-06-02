package homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        Human Michael = new Human("Michael", "Karoline", 1975, 90);
        Human Laura = new Human("Laura", "Karoline", 1975, 93);
        Human John = new Human("John", "Bravo", 2004, 88);
        Human Rose = new Human("Rose", "Bravo", 2006, 90);
        Pet hamster = new Pet("Hamster", "Yulaf", 2, 40, new String[]{"eating,running,sleeping"});


        Family family = new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(hamster);
        System.out.println(family.toString());
        System.out.println("Number of family members: " + family.countFamily());
        family.deleteChild(0);
        System.out.println("Number of family members after child leave family: " + family.countFamily());
        System.out.println(family.toString());

    }
}
