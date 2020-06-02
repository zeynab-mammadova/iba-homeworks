package homeworks.homework12.dao;

import java.util.List;

public interface FamilyDao<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T f);
    void saveFamily(T f);

}
