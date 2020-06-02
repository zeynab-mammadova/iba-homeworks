package homeworks.homework10.App;

import homeworks.homework10.Controller.FamilyController;
import homeworks.homework10.Dao.CollectionFamilyDao;
import homeworks.homework10.Dao.FamilyDao;
import homeworks.homework10.Service.FamilyService;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FamilyDao familyDao=new CollectionFamilyDao();
        FamilyService familyService=new FamilyService(familyDao);
        FamilyController controller=new FamilyController(familyService);

        Human Michael = new Man("Michael", "Karoline", LocalDate.of(1970, 2, 20).toEpochDay(), null);
        System.out.println("Michael Karoline"+Michael.describeAge());
        Human Laura = new Woman("Laura", "Karoline", LocalDate.of(1973, 8, 31).toEpochDay(), null);
        System.out.println("Laura Karoline "+Laura.describeAge());


        Human Tom = new Man("Tom", "West", LocalDate.of(1976, 1, 15).toEpochDay(), null);
        System.out.println("Tom West"+Tom.describeAge());
        Human Jane = new Woman("Jane", "West", LocalDate.of(1964, 2, 18).toEpochDay(), null);
        System.out.println("Jane West "+Jane.describeAge());

        controller.createNewFamily(Michael, Laura);
        controller.createNewFamily(Tom, Jane);

        Family karoline = controller.getFamilyById(0);
        Family west = controller.getFamilyById(1);

        Human JohnKaroline = new Man("John", "Karoline", LocalDate.of(2007, 8, 30).toEpochDay(), karoline);
        System.out.println("John Karoline"+JohnKaroline.describeAge());
        Human RoseKaroline = new Woman("Rose", "Karoline", LocalDate.of(1993, 6, 5).toEpochDay(), karoline);
        System.out.println("Rose Karoline "+RoseKaroline.describeAge());

        //Create new family
        Human mikeParker = new Man("Mike", "Parker", LocalDate.of(1955, 4, 11).toEpochDay(), null);
        System.out.println("Mike Parker "+mikeParker.describeAge());
        Human hudaParker = new Man("Huda", "Parker", LocalDate.of(1957, 12, 31).toEpochDay(), null);
        System.out.println("Huda Parker "+hudaParker.describeAge());
        controller.createNewFamily(mikeParker, hudaParker);

        //addPet and getPets
        controller.addPet(1, new Fish(Species.FISH, "Nemo",55));
        controller.addPet(1, new Fish(Species.FISH, "Bo",65));
        Set<Pet> westPet = controller.getPets(1);
        System.out.println("Pets of The West': " + westPet.toString());

        //count
        int familyCount = controller.count();
        System.out.printf("There are %d families.\n", familyCount);


        controller.adoptChild(west, new Man("Bob", "Hailey", "21/09/1996", 99));



        System.out.println("Get all families:");
        controller.getAllFamilies().forEach(family -> System.out.println(family.toString()));


        System.out.println("Display all families:");
        controller.displayAllFamilies();


        System.out.println("All families bigger than 2:");
        controller.getAllFamiliesBiggerThan(2);
        System.out.println("All families less than 4:");
        controller.getAllFamiliesLessThan(4);


        controller.deleteAllChildrenOlderThan(15);
        System.out.println("After deleting older children");
        controller.displayAllFamilies();


        System.out.println("One new member was born");
        controller.bornChild(controller.getFamilyById(1), "Jame", "Susan");
        controller.displayAllFamilies();


        int count = controller.countFamiliesWithMemberNumber(3);
        System.out.printf("There are %d families with 3 members\n", count);


        Family family = controller.getFamilyById(0);
        System.out.println("Family at index 1 will be deleted: " + family.toString());
        controller.deleteFamilyByIndex(0);

        controller.displayAllFamilies();


    }
}

