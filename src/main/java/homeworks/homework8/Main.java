package homeworks.homework8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
          Map<String, String> tb = new HashMap<String, String>();
  Human Michael = new Human("Michael", "Karoline", 1975,95);
        Human Laura = new Human("Laura", "Karoline", 1975,100);
        Human John = new Human("John", "Karoline", 2004,87);
        Human Rose = new Human("Rose", "Karoline", 2006,89);
        DomesticCat cat=new DomesticCat(Species.DOMESTICCAT,"Meowchik",55);
        Dog dog=new Dog(Species.DOG,"Pug",66);
          Set<Pet> pets=new HashSet<Pet>();
          pets.add(dog);
          pets.add(cat);

        Family family = new Family();
        family.setFather(Michael);
        family.setMother(Laura);
        family.addChild(John);
        family.addChild(Rose);
        family.setPet(pets);
        System.out.println("Number of family members: " + family.countFamily());
        System.out.println(family.toString());
        family.deleteChild(0);
        System.out.println("Number of family members after 1st deleting: "+family.countFamily() );
        System.out.println(family.toString());
        family.deleteChild(Rose);
        System.out.println("Number of family members after 2nd deleting: "+family.countFamily() );
        System.out.println(family.toString());

    }
}

