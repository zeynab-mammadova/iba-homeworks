package homeworks.homework13.dao;

import java.io.IOException;
import java.util.List;

public interface FamilyDao<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T f);
    void saveFamily(T f);
    void saveData() throws IOException;
    void loadData() throws IOException, ClassNotFoundException;
}
