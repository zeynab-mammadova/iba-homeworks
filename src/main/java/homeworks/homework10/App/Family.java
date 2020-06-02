package homeworks.homework10.App;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children=new ArrayList<Human>();
    private Set<Pet> pet=new HashSet<Pet>();

    public Family(Human father, Human mother, List<Human> children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    public Family(){

    }

    public Family(Human father, Human mother, List<Human> children, Set<Pet> pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }


    public void addChild (Human child) {
        if(children.contains(child)) return;
        this.children.add(child);
        child.setFamily(this);
    }

    public Human deleteChild(int index)  {
        Human child = children.remove(index);
        return child;
    }

    public boolean deleteChild(Human child) {
        if (children.indexOf(child) == -1) {
            return false;
        }
        int index = children.indexOf(child);
        Human human = children.remove(index);
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }


    public Human getMother() {
        return mother;
    }

    public Family setMother(Human mother) {
        this.mother = mother;
        return new Family(this.father, this.mother);

    }

    public Human getFather() {
        return father;
    }

    public Family setFather(Human father) {
        this.father = father;
        return new Family(this.father, this.mother);
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }
    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }
public void addPet(Pet pet){
        this.pet.add(pet);
}


    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) &&
                Objects.equals(getFather(), family.getFather()) &&
                Objects.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {

        return  Objects.hash(getMother(), getFather(),getChildren());

    }

}

