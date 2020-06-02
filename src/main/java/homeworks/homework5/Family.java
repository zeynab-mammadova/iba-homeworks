package homeworks.homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father,Human []children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(){

    }

    public int countFamily(){
        return 2+children.length;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        if(children!=null){
            Human [] ushaq=new Human[children.length+1];
            for (int i=0;i<children.length;i++){
                ushaq[i]=children[i];
            }
            ushaq[children.length]=child;
            children=ushaq;
        }
        else {
            Human[]ushaq=new Human[1];
            ushaq[0]=child;
            children=ushaq;
        }
}
    public void deleteChild (int i) {
        if (children != null) {
            Human[] ushaq = new Human[children.length-1];
            for (int j = 0; j < children.length; j++) {
                if (j < i) {
                    ushaq[j] = children[j];
                } else if (j > i) {
                    ushaq[j - 1] = children[j];
                }
            }
            children = ushaq;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return this.getMother().equals(family.getMother()) &&
                this.getFather().equals(family.getFather()) &&
                Arrays.equals(this.getChildren(), family.getChildren());

    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;

    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

}
