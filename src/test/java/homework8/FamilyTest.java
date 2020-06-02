package homework8;

import homeworks.homework8.Family;
import homeworks.homework8.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {
    private Family family;
    private Human child1=new Human("John","Karoline",2016,99);
    private Human child2=new Human("Rose","Karoline",2019,98);
    private List<Human> children = new ArrayList<>();

    @BeforeEach
    public void BeforeEach(){
        this.family=new Family();
        children.add(child1);
        children.add(child2);
        family.setChildren(children);
    }
    @Test
    public void testAddChild(){
        assertEquals(2, children.size());
    }
    @Test
    public void testDeleteChildWithName(){
        family.deleteChild(child1);
        assertEquals(1, children.size());
    }
    @Test
    public void testDeleteChildWithIndex(){
        family.deleteChild(0);
        assertEquals(1,children.size());
    }
    @Test
    public void testCountFamily(){
        assertEquals(4,family.countFamily());
    }
    @Test
    public void testToString(){
        String expected="Family{" +
                "mother=null"  +
                ", father=null" +
                ", pet=[]" +
                ", children=" + children +
                '}';
        assertEquals(expected,family.toString());
    }


}
