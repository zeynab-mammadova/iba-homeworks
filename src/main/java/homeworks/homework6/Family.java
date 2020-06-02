package homeworks.homework6;
import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    int counter=0;

    public Family(Human mother,Human father, Human[]children,Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children =children;
        this.pet=pet;
    }
    public Family(){

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


    public boolean deleteChild(Human child) {
        boolean flag=false;
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                Human childIndex = children[i];
                if (childIndex.equals(child)) {
                    for (int n = i; n < children.length - 1; n++) {
                        children[n] = children[n + 1];
                        flag = true;
                    }
                    counter--;
                    break;

                }
            }}
            return flag;
        }


    public boolean deleteChild(int index) {
        boolean flag = false;
        if (children != null) {
        for (int i = 0; i < children.length; i++) {
            if (index == i) {
                for(int n = i; n < children.length - 1; n++){
                    children[n] = children[n+1];
                    flag=true;
                }counter--;
                break;
            }
        }}
        return flag;
    }

    public void addChild(Human child)  {
        if(children != null) {
            this.children[this.counter] = child;
            counter++;
        }
    }


    public int countFamily() {
        return 2 + counter;
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
       return Objects.hash(getMother(), getFather(),getChildren());

    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet= "+pet+
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized in Family class: " + this);
    }

}

