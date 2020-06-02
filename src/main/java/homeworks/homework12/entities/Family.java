package homeworks.homework12.entities;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;
    private Set<Pet> pets= new HashSet<>();


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father, Set<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.pets = pets;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        if (children == null) {
            children = new ArrayList<>() ;
            children.add(child);
        } else {
           children.add(child);
        }
    }

    public void deleteChild(int index) {
        if (children!=null)
        children.remove(index);
    }

    public int countFamily() {
        if (children==null) return 2;
        return children.size() + 2;
    }
    @Override
    public String toString() {
        return "family:\n"+
                "mother:"+mother+",\n"+
                "father:"+father+",\n"+
                "children:\n"+
                children+"\n"+
                "pets:"+pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) &&
                Objects.equals(pet, family.pet) &&
                Objects.equals(pets, family.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet, pets);
    }

}
