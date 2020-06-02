package homeworks.homework10.Service;

import homeworks.homework10.App.Family;
import homeworks.homework10.App.Human;
import homeworks.homework10.App.Man;
import homeworks.homework10.App.Pet;
import homeworks.homework10.Dao.FamilyDao;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        List<Family> families = getAllFamilies();
        families.forEach(family -> System.out.printf("%d. %s\n", families.indexOf(family)+1, family.toString()));
    }

    public void getAllFamiliesBiggerThan(int index) {
        Stream<Family> familyStream = getAllFamilies().stream();
        familyStream
                .filter(family -> family.countFamily() > index)
                .forEach(family -> System.out.printf("%s\n", family.toString()));
    }

    public void getAllFamiliesLessThan(int index) {
        Stream<Family> familyStream = getAllFamilies().stream();
        familyStream
                .filter(family -> family.countFamily() < index)
                .forEach(family -> System.out.printf("%s\n", family.toString()));
    }

    public int countFamiliesWithMemberNumber(int memberCount) {
        List<Family> families = familyDao.getAllFamilies();
        families = families.stream()
                .filter(family -> family.countFamily() == memberCount)
                .collect(Collectors.toList());

        return families.size();
    }

    public void createNewFamily(Human father, Human mother) {
        familyDao.saveFamily(new Family(father, mother));
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(familyDao.getFamilyByIndex(index));
    }

    public Family bornChild(Family family, String boyName, String girlName) {
        Random rand = new Random();
        if (!familyDao.getAllFamilies().contains(family)) familyDao.saveFamily(family);
        String surname = family.getFather().getSurname();
        LocalDate birthDate = LocalDate.now();
        Human child;
        if (rand.nextBoolean()) child = new Man(boyName, surname, birthDate.toEpochDay(), family);
        else child = new Man(girlName, surname, birthDate.toEpochDay(), family);
        family.addChild(child);
        return family;
    }

    public Family adoptChild(Family family, Human human) {
        if (getAllFamilies().contains(family)) {
            family.addChild(human);
        } else {
            family.addChild(human);
            familyDao.saveFamily(family);
        }
        return family;
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }


    public void deleteAllChildrenOlderThan(int age) {
        LocalDate year = LocalDate.now();

        getAllFamilies().forEach(family -> {
            List<Human> youngerChildren =  family.getChildren();
          youngerChildren
                .removeIf((human)->(Period.between(LocalDate.ofEpochDay(human.getYear()), year).getYears()) > age);
                    family.setChildren(youngerChildren);
                    familyDao.saveFamily(family);
        });
    }

    public Set<Pet> getPets(int index) {
        return getFamilyById(index).getPet();
    }

    public void addPet(int index, Pet pet) {
        getFamilyById(index).addPet(pet);
    }
}
