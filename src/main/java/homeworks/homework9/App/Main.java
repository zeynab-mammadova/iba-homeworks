package homeworks.homework9.App;

import homeworks.homework9.Controller.FamilyController;
import homeworks.homework9.Dao.CollectionFamilyDao;
import homeworks.homework9.Dao.FamilyDao;
import homeworks.homework9.Service.FamilyService;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FamilyDao familyDao=new CollectionFamilyDao();
        FamilyService familyService=new FamilyService(familyDao);
        FamilyController controller=new FamilyController(familyService);

        Human Michael = new Man("Michael", "Karoline", 1970, null);
        Human Laura = new Woman("Laura", "Karoline", 1973, null);

        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);

        controller.createNewFamily(Michael, Laura);
        controller.createNewFamily(Tom, Jane);

        Family karoline = controller.getFamilyById(0);
        Family west = controller.getFamilyById(1);

        Human JohnKaroline = new Man("John", "Karoline", 2007, karoline);
        Human RoseKaroline = new Woman("Rose", "Karoline", 1993, karoline);

        //Create new family
        Human mikeParker = new Man("Mike", "Parker", 1955, null);
        Human hudaParker = new Man("Huda", "Parker", 1957, null);
        controller.createNewFamily(mikeParker, hudaParker);

        //addPet and getPets
        controller.addPet(1, new Fish(Species.FISH, "Nemo",55));
        controller.addPet(1, new Fish(Species.FISH, "Bo",65));
        Set<Pet> westPet = controller.getPets(1);
        System.out.println("Pets of The West': " + westPet.toString());

        //count
        int familyCount = controller.count();
        System.out.printf("There are %d families.\n", familyCount);


        controller.adoptChild(west, new Man("Bob", "Hailey", 2006, null));


        System.out.println("Get all families:");
        controller.getAllFamilies().forEach(family -> System.out.println(family.toString()));


        System.out.println("Display all families:");
        controller.displayAllFamilies();


        System.out.println("All families bigger than 2:");
        controller.getAllFamiliesBiggerThan(2);
        System.out.println("All families less than 4:");
        controller.getAllFamiliesLessThan(4);


        controller.deleteAllChildrenOlderThan(15,2020);
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

