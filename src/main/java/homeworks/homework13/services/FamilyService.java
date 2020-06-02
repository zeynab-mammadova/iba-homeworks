package homeworks.homework13.services;

import homeworks.homework13.dao.CollectionFamilyDao;
import homeworks.homework13.dao.FamilyDao;
import homeworks.homework13.entities.*;
import homeworks.homework13.exception.FamilyOverflowException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao<Family> familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void saveFamily(Family f) {
        familyDao.saveFamily(f);
    }

    public void displayAllFamilies() {
        for (int i = 0; i <getAllFamilies().size() ; i++) {
            System.out.println(i+1+"."+getFamilyById(i));
        }
    }

    public List<Family> getFamiliesBiggerThan(int value) {
        return getAllFamilies().stream().filter(family -> family.countFamily() > value).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int value) {
        return getAllFamilies().stream().filter(family -> family.countFamily() < value).collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int value) {
        return (int) getAllFamilies().stream().filter(family -> family.countFamily() == value).count();
    }

    public void createNewFamily(Woman mother, Man father) {
        Family family = new Family(mother, father);
        saveFamily(family);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }
    public Family bornChild(Family family, String boyName, String girlName) throws FamilyOverflowException {
        if (!familyDao.getAllFamilies().contains(family)) return family;
        Random rand = new Random();
        String surname = family.getFather().getSurname();
        LocalDate birthDate = LocalDate.now();
       Human child;
        if (rand.nextBoolean()) child = new Man(boyName, surname, birthDate, family);
        else child = new Woman(girlName, surname, birthDate, family);
        try {
            family.addChild(child);
        } catch (FamilyOverflowException e) {
            throw e;
        }
        return family;
    }

    public Family adoptChild(Family family,Human human) throws FamilyOverflowException {
        if (getAllFamilies().contains(family)) {
            family.addChild(human);
        } else {
            family.addChild(human);
            familyDao.saveFamily(family);
        }
        return family;
    }

    public void deleteAllChildrenOlderThan(int age){
        familyDao.getAllFamilies().stream()
                .forEach(f->f.getChildren().removeIf(child-> Period.between(child.getBirthDate(), LocalDate.now()).getYears()> age));
    }

    public int count() {
        return getAllFamilies().size();
    }

    public Family getFamilyById(int index) {try{
        return familyDao.getFamilyByIndex(index);}
        catch (Exception ex){
        return null;
        }
    }

    public Set<Pet> getPets(int index) {
        return getFamilyById(index).getPets();
    }

    public void addPet(int index, Pet pet) {
        getFamilyById(index).getPets().add(pet);
    }
    public void saveData() throws IOException {
        familyDao.saveData();
    }

    public void loadData() throws IOException, ClassNotFoundException {
        familyDao.loadData();
    }


}
