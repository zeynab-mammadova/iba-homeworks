package homework9;

import homeworks.homework9.App.*;
import homeworks.homework9.Dao.CollectionFamilyDao;
import homeworks.homework9.Service.FamilyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FamilyServiceTest {
    private FamilyService familyService;

    @BeforeEach
    public void before() {
        this.familyService = new FamilyService(new CollectionFamilyDao());
    }

    @Test
    public void testGetAllFamilies() {
        Human Michael = new Man("Michael", "Karoline", 1970, null);
        Human Laura = new Woman("Laura", "Karoline", 1973, null);
        familyService.createNewFamily(Michael, Laura);
        List<Family> families = new ArrayList<>();
        families.add(new Family(Michael, Laura));
        assertEquals(families, familyService.getAllFamilies());
    }

   private void assertEquals(List<Family> families, List<Family> allFamilies) {
    }

    @Test
    public void countFamiliesWithMemberNumber() {
        Human Michael = new Man("Michael", "Karoline", 1970, null);
        Human Laura = new Woman("Laura", "Karoline", 1973, null);

        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);

        familyService.createNewFamily(Michael, Laura);
        familyService.createNewFamily(Tom, Jane);
        familyService.bornChild(familyService.getFamilyById(0), "John", "Rose");
        familyService.bornChild(familyService.getFamilyById(0), "Daniel", "Lea");
        familyService.bornChild(familyService.getFamilyById(1), "Michael", "Adele");
        familyService.bornChild(familyService.getFamilyById(1), "Peter", "Michel");
        familyService.bornChild(familyService.getFamilyById(1), "Adrey", "Susanna");

        assertEquals(1, familyService.countFamiliesWithMemberNumber(5));

    }

    private void assertEquals(int i, int countFamiliesWithMemberNumber) {
    }

    @Test
    public void deleteFamilyByIndex() {
        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);
        familyService.createNewFamily(Tom, Jane);
        assertTrue(familyService.deleteFamilyByIndex(0));
    }

    private void assertTrue(boolean deleteFamilyByIndex) {
    }

    @Test
    public void bornChild() {
        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);
        familyService.createNewFamily(Tom, Jane);
        int familySize = familyService.getFamilyById(0).countFamily();
        familyService.bornChild(familyService.getFamilyById(0), "Jane", "Lewis");

        assertEquals(familySize+1, familyService.getFamilyById(0).countFamily());
    }

    @Test
    public void adoptChild() {
        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);
        Family family = new Family(Tom, Jane);
        familyService.createNewFamily(Tom, Jane);

        Human adopted = new Human("Bob", "Hailey", 2005, null);
        family.addChild(adopted);

        familyService.adoptChild(familyService.getFamilyById(0), adopted);

        assertEquals(family, familyService.getFamilyById(0));
    }

    private void assertEquals(Family family, Family familyById) {
    }

    @Test
    public void count() {
        Human Michael = new Man("Michael", "Karoline", 1970, null);
        Human Laura = new Woman("Laura", "Karoline", 1973, null);

        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);

        familyService.createNewFamily(Michael, Laura);
        familyService.createNewFamily(Tom, Jane);

        assertEquals(2, familyService.count());
    }

    @Test
    public void getFamilyById() {
        Human Michael = new Man("Michael", "Karoline", 1970, null);
        Human Laura = new Woman("Laura", "Karoline", 1973, null);
        Human Tom = new Man("Tom", "West", 1960, null);
        Human Jane = new Woman("Jane", "West", 1964, null);
        List<Family> families = new ArrayList<>();
        families.add(new Family(Michael, Laura));
        families.add(new Family(Tom, Jane));
        familyService.createNewFamily(Michael, Laura);
        familyService.createNewFamily(Tom, Jane);

        assertEquals(families.get(0), familyService.getFamilyById(0));
    }

    @Test
    public void getPets() {
        Human james = new Man("James", "Maud", 1960, null);
        Human natalia = new Woman("Natalia", "Maud", 1970, null);
        familyService.createNewFamily(james,natalia);
        familyService.addPet(0, new Dog(Species.DOG, "Rex",60));
        familyService.addPet(0, new RoboCat(Species.ROBOCAT, "Rob",55));
        familyService.addPet(0, new Fish(Species.FISH, "Nome",45));

        Set<Pet> pets = new HashSet<>();
        pets.add(new Dog(Species.DOG, "Rex",60));
        pets.add(new RoboCat(Species.ROBOCAT, "Rob",55));
        pets.add(new Fish(Species.FISH, "Nemo",45));

        assertEquals(pets, familyService.getPets(0));
    }

    private void assertEquals(Set<Pet> pets, Set<Pet> pets1) {
    }
}
