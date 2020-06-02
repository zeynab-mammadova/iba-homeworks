package homework13;//package homework13;
//
//import homeworks.homework13.entities.*;
//import homeworks.homework13.services.FamilyService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FamilyServiceTest {
//
//    Man Michael = new Man("Michael", "Karoline", LocalDate.of(1970, 2, 20),88);
//    Woman Laura = new Woman("Laura", "Karoline",   LocalDate.of(1973,8,31),89);
//    Human Rose = new Human("Rose", "Karoline",   LocalDate.of(1993, 6, 5));
//    Human John = new Human("John", "Karoline",  LocalDate.of(2007, 8, 30));
//
//
//    Man Tom= new Man("Tom", "West", LocalDate.of(1976, 1, 15));
//    Woman Jane= new Woman("Jane", "West", LocalDate.of(1964, 2, 18));
//    Human child2 = new Human("Joe", "West", LocalDate.of(1899,4,14));
//
//
//      Woman Huda=new Woman("Huda", "Parker", LocalDate.of(1957, 12, 31));
//       Man Mike=     new Man("Mike", "Parker", LocalDate.of(1955, 4, 11));
//
//
//    Family f = new Family(Laura, Michael);
//    FamilyService fs = new FamilyService();
//    List<Family> familyList = new ArrayList<>();
//
//
//    @BeforeEach
//    void setUp() {
//        fs.createNewFamily(Laura,  Michael);
//        fs.createNewFamily(Jane, Tom);
//        familyList.add(fs.getFamilyById(0));
//        familyList.add(fs.getFamilyById(1));
//
//    }
//
//    @Test
//    void getAllFamilies() {
//        assertEquals(1, fs.getAllFamilies().size());
//
//    }
//
//    @Test
//    void getFamiliesBiggerThan() {
//        fs.addPet(1, new DomesticCat(Species.CAT,"Meowchik",3,79));
//        fs.addPet(1, new Dog(Species.DOG,"Awesome boy",4,48));
//        fs.addPet(1, new DomesticCat(Species.CAT,"Yulaf",3,79));
//        fs.addPet(1, new RoboCat(Species.ROBOCAT,"Bibo",1,60));
//        assertEquals(1, fs.getFamiliesBiggerThan(4).size());
//
//
//    }
//
//    @Test
//    void getFamiliesLessThan() {
//        assertEquals(familyList, fs.getFamiliesLessThan(3));
//        fs.addPet(1, new Dog(Species.DOG,"Awesome boy",4,48));
//        fs.addPet(1, new DomesticCat(Species.CAT,"Yulaf",3,79));
//        assertEquals(1, fs.getFamiliesLessThan(4).size());
//
//
//    }
//
//    @Test
//    void createNewFamily() {
//        assertEquals(2, fs.count());
//        fs.createNewFamily(Huda, Mike);
//        assertEquals(3, fs.count());
//
//        familyList.add(new Family(Huda, Mike));
//        assertEquals(familyList, fs.getAllFamilies());
//
//    }
//
//    @Test
//    void countFamiliesWithMemberNumber() {
//        assertEquals(2, fs.countFamiliesWithMemberNumber(2));
//        fs.bornChild(familyList.get(1), "Jame", "Susan");
//        fs.bornChild(familyList.get(1), "Nick", "Luca");
//        assertEquals(1, fs.countFamiliesWithMemberNumber(4));
//    }
//
//    @Test
//    void deleteFamilybyIndex() {
//        fs.deleteFamilyByIndex(0);
//        familyList.remove(0);
//        assertEquals(familyList, fs.getAllFamilies());
//    }
//
//    @Test
//    void bornChild() {
//        fs.bornChild(f, "Peter", "Maria");
//        assertEquals(1, f.getChildren().size());
//        assertEquals("Karoline", f.getChildren().get(0).getSurname());
//        if (f.getChildren().get(0) instanceof Woman) {
//            assertEquals("Maria", f.getChildren().get(0).getName());
//        } else {
//            assertEquals("Peter", f.getChildren().get(0).getName());
//        }
//    }
//
//    @Test
//    void adoptChild() {
//        fs.adoptChild(f, Rose);
//        fs.adoptChild(f, John);
//        assertEquals(4, f.countFamily());
//
//    }
//
//    @Test
//    void deleteAllChildrenOlderThan() {
//        fs.adoptChild(familyList.get(0), Rose);
//        fs.adoptChild(familyList.get(0), John);
//        fs.adoptChild(familyList.get(1), child2);
//        fs.deleteAllChildrenOlderThan(15);
//        assertFalse(familyList.get(0).getChildren().contains(Rose));
//        assertFalse(familyList.get(0).getChildren().contains(John));
//        assertEquals(0, familyList.get(1).getChildren().size());
//
//    }
//
//    @Test
//    void count() {
//
//        fs.createNewFamily(Huda, Mike);
//        assertEquals(3, fs.count());
//    }
//
//    @Test
//    void getFamilybyId() {
//        assertEquals(familyList.get(0), fs.getFamilyById(0));
//        assertEquals(familyList.get(1), fs.getFamilyById(1));
//
//    }
//
//
//    @Test
//    void addAndGetPet() {
//        fs.createNewFamily(Laura, Michael);
//        Pet Wallee = new DomesticCat(Species.CAT,"Yulaf",3,79);
//        Pet rex = new Dog(Species.DOG,"Awesome boy",4,48);
//        fs.addPet(0, Wallee);
//        fs.addPet(0, rex);
//        List<Pet> pets = new ArrayList<>();
//        pets.add(Wallee);
//        pets.add(rex);
//        assertTrue(fs.getPets(0).contains(pets.get(0)));
//        assertTrue(fs.getPets(0).contains(pets.get(1)));
//        assertEquals(2, fs.getPets(0).size());
//
//    }
//}
