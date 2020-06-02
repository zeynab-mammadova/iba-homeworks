package homeworks.homework12.controller;

import homeworks.homework12.entities.*;
import homeworks.homework12.exception.FamilyOverflowException;
import homeworks.homework12.services.FamilyService;

import java.util.List;
import java.util.Set;

public class FamilyController {
        private FamilyService familyService= new FamilyService();
    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void saveFamily(Family f) {
        familyService.saveFamily(f);
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }


    public List<Family> getFamiliesBiggerThan(int value) {
       return familyService.getFamiliesBiggerThan(value);
    }


    public List<Family> getFamiliesLessThan(int value) {
        return familyService.getFamiliesLessThan(value);
    }


    public int countFamiliesWithMemberNumber(int value) {
        return familyService.countFamiliesWithMemberNumber(value);
    }


    public void createNewFamily(Woman mother, Man father){
       familyService.createNewFamily(mother,father);
    }


    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }


    public Family bornChild(Family family, String boyName, String girlName) throws FamilyOverflowException, NullPointerException {
        try {
            if (family.countFamily() >= 5) {
                throw new FamilyOverflowException("More than 5 members will not be allowed");
            }
            return familyService.bornChild(family, boyName, girlName);
        }catch (NullPointerException ex){
            return null;
        }

    }
    public Family adoptChild(Family family, Human human) {
        try {

            if (family.countFamily() >= 5) {
                throw new FamilyOverflowException("More than 5 members is not be allowed");
            }
            return familyService.adoptChild(family, human);
        } catch (NullPointerException ex){
            return null;
        }
    }



    public void deleteAllChildrenOlderThan(int age){
        familyService.deleteAllChildrenOlderThan(age);
    }


    public int count(){
        return familyService.count();
    }


    public Family getFamilyById (int index) {
        return familyService.getFamilyById(index);
    }


    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }


    public void addPet(int index, Pet pet){
       familyService.addPet(index,pet);
    }
}
