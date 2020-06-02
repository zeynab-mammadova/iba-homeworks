package homeworks.homework13.dao;


import homeworks.homework13.entities.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    public static List<Family> families=new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try{
            return families.get(index);}
        catch (IndexOutOfBoundsException | NullPointerException e ){
            System.out.println("Wrong Family Index");
            return null;
        }
    }


    @Override
    public boolean deleteFamily(int index) {
        for (int i = 0; i <families.size() ; i++) {
            if (i == index) {
                families.remove(index);
                System.out.println("Family deleted..");
                return true;
            }
        }
        System.out.println("Invalid id");
        return false;
    }

    @Override
    public boolean deleteFamily(Family f) {
        if (families.contains(f)){
            families.remove(f);
            return true;
        }
        return false;
    }

    @Override
    public void saveFamily(Family f) {
        if (families.contains(f)){
            families.remove(f);
            families.add(f);
        }
        families.add(f);
    }
    @Override
    public void saveData() throws IOException {
        FileOutputStream fout = new FileOutputStream("db/families.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(families);
        oos.close();
        fout.close();
    }

    @Override
    public void loadData() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("db/families.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        families = (List<Family>) ois.readObject();
        System.out.println(families);
        ois.close();
        fin.close();

    }

}
