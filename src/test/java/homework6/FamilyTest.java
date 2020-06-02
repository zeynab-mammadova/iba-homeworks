package homework6;

import homeworks.homework6.Family;
import homeworks.homework6.Human;
import homeworks.homework6.Pet;
import homeworks.homework6.Species;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    private Family family;
    private Human child1 = new Human("Rose","Karoline",1993,88);
    private Human child2=new Human("John","Karoline",2007,98);
    private Human[] children1=new Human[3];

    @BeforeEach
    public void BeforeEach(){
        this.family=new Family();
        Human[] children=new Human[3];
        family.setChildren(children);
        family.addChild(child1);
        family.addChild(child2);
    }
    @Test
    public void testDeleteChild(){
        family.deleteChild(child1);
        children1[0]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testDeleteChildByIndex(){
        family.deleteChild(0);
        children1[0]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testAddChild(){
        children1[0]=child1;
        children1[1]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testCountFamily(){
        assertEquals(5,family.countFamily());
    }
    @Test
    public void testToString(){
        String expected = "Family{" + "mother=null"  + ", father=null" + ", children=" + Arrays.toString(family.getChildren()) + ", pet=null"  + '}';
        assertEquals(expected, family.toString());
    }
    @Test
    public  void testForEquals(){
        String[] habits = {"eating", "drinking", "sleeping"};
        Pet dog1 = new Pet(Species.DOG, "Rock", 5, 75, habits);
        Pet dog2 = new Pet(Species.DOG, "Lucky", 5, 75, habits);
        assertTrue(dog1.equals(dog2));
    }


}